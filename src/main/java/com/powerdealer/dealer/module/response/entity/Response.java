package com.powerdealer.dealer.module.response.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private String type;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    public void put(String key, Object value) {
        this.data.put(key, value);
    }

    public void putAll(Map<String, Object> map) {
        this.data.putAll(map);
    }
}