package com.ignite.bookfinder;

import com.ignite.bookfinder.domain.oreilly.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootApplication
public class BookFinderApplication {

	@Bean
	public RedisOperations<String, Result> redisOperations(RedisConnectionFactory factory){
		Jackson2JsonRedisSerializer<Result> serializer =
				new Jackson2JsonRedisSerializer<Result>(Result.class);

		RedisTemplate<String, Result> template = new RedisTemplate<>();
		template.setConnectionFactory(factory);
		template.setDefaultSerializer(serializer);
		template.setKeySerializer(new StringRedisSerializer());

		return template;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookFinderApplication.class, args);
	}

}
