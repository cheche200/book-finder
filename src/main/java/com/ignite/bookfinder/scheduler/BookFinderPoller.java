package com.ignite.bookfinder.scheduler;

import com.ignite.bookfinder.domain.oreilly.Result;
import com.ignite.bookfinder.domain.oreilly.ResultWrapper;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.PostConstruct;

@Component
public class BookFinderPoller {

    private WebClient client = WebClient.create("https://learning.oreilly.com/api/v2/search/?query=python");

    private final RedisConnectionFactory connectionFactory;

    private final RedisOperations<String, Result> redisOperations;

    public BookFinderPoller(RedisConnectionFactory connectionFactory, RedisOperations<String, Result> redisOperations) {
        this.connectionFactory = connectionFactory;
        this.redisOperations = redisOperations;
    }

    @PostConstruct
    private void pollBooks(){
        connectionFactory.getConnection().serverCommands().flushDb();
        client.get()
                .retrieve()
                .bodyToFlux(ResultWrapper.class)
                .toStream()
                .forEach(b -> b.getResults().stream().forEach(result -> redisOperations.opsForValue().set(result.getId(), result)));

        redisOperations.opsForValue()
                .getOperations().keys("*").forEach(b -> System.out.println(redisOperations.opsForValue().get(b)));
    }
}
