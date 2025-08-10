package com.fredmain.url_shortener.infra.cache;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Service
@Profile("test")
public class InMemoryCacheService implements CacheService {

    Map<String,String> cache = new ConcurrentHashMap<>();
    @Override
    public String get(String key) {
        return cache.get(key);
    }
    @Override
    public void set(String key, String value) {
        cache.put(key, value);
    }

}
