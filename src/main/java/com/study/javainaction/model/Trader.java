package com.study.javainaction.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.SplittableRandom;

@Getter
public class Trader {
    private final String name;
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
