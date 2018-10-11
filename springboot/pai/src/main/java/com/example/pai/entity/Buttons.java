package com.example.pai.entity;

import lombok.Data;

@Data
public class Buttons {
    private String name;

    public Buttons(String name) {
        this.name = name;
    }
}
