package com.study.javainaction.function.apple_ex_1;

import lombok.Getter;

@Getter
public class Apple {
    private int weight;
    private Color color;

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }
}
