package com.fredmain.url_shortener.infra.cache;

public interface CacheService {
    String get(String key);
    void set(String key, String value);
}
