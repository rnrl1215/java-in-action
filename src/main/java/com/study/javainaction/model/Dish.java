package com.study.javainaction.model;

import com.study.javainaction.enums.DishType;
import lombok.Getter;

@Getter
public class Dish {
    private final int calories;
    private final DishType dishType;
    private final String name;

    public Dish(String name, int calories, DishType dishType) {
        this.name = name;
        this.calories = calories;
        this.dishType = dishType;
    }
}
