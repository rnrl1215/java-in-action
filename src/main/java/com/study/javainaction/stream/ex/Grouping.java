package com.study.javainaction.stream.ex;

import com.study.javainaction.enums.DishType;
import com.study.javainaction.model.Dish;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;

public class Grouping {
    public Map<DishType, List<Dish>> groupingCalories(List<Dish> dishes) {
        return dishes.stream().collect(groupingBy(Dish::getDishType));
    }

    public  Map<DishType, Set<String>> getTags(List<Dish> dishes) {

        Map<String, List<String>> tags = new HashMap<>();
        tags.put("pork", asList("greasy","salty"));
        tags.put("chicken", asList("fried","crisp"));
        tags.put("salmon", asList("delicious","fresh"));
        tags.put("prawns", asList("tasty","roasted"));
        tags.put("rice", asList("light","natural"));

       return dishes.stream()
                        .collect(groupingBy(Dish::getDishType,
                            flatMapping(dish -> tags.get(dish.getName()).stream(), toSet())
                         )
        );
    }
}
