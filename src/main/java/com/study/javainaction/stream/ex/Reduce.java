package com.study.javainaction.stream.ex;

import com.study.javainaction.enums.DishType;
import com.study.javainaction.model.Dish;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;


public class Reduce {
    public int sumCalories(List<Dish> dishes) {
        return dishes.stream().map(Dish::getCalories).reduce(0, Integer::sum);
    }

}
