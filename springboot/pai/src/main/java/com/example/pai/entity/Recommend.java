package com.example.pai.entity;

import lombok.Data;

@Data
public class Recommend {
    private String name;
    private String info;
    private String count;

    public Recommend(String name, String info, String count) {
        this.name = name;
        this.info = info;
        this.count = count;
    }
}
