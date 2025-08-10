package com.fredmain.url_shortener.infra.cache;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Profile("prod")
public class RedisService implements CacheService {
    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }
    @Override
    public String get(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }

}
