package com.ignite.bookfinder.scheduler;

import com.ignite.bookfinder.domain.oreilly.Result;
import com.ignite.bookfinder.domain.oreilly.ResultWrapper;
import com.ignite.bookfinder.repository.BookRepository;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.PostConstruct;

@Component
public class BookFinderPoller {

    private WebClient client = WebClient.create("https://learning.oreilly.com/api/v2/search/?query=python");

    private final RedisConnectionFactory connectionFactory;

    private final BookRepository bookRepository;

    public BookFinderPoller(RedisConnectionFactory connectionFactory, BookRepository bookRepository) {
        this.connectionFactory = connectionFactory;
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    private void pollBooks(){
        connectionFactory.getConnection().serverCommands().flushDb();
        client.get()
                .retrieve()
                .bodyToFlux(ResultWrapper.class)
                .toStream()
                .forEach(b -> b.getResults().stream().forEach(bookRepository::save));

        bookRepository.findAll().forEach(System.out::println);
    }
}
