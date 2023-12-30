package com.study.javainaction.stream.reduce;

import com.study.javainaction.enums.DishType;
import com.study.javainaction.model.Dish;
import com.study.javainaction.stream.ex.Grouping;
import com.study.javainaction.stream.ex.Reduce;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class ReduceTest {

    // 연습용이라 어노테이션 사용안함.
    private Reduce reduce = new Reduce();

    private Grouping grouping = new Grouping();

    @Test
    void sumTest() {
        Dish dish = new Dish("pork",10, DishType.MEAT);
        Dish dish1 = new Dish("chicken",20, DishType.MEAT);
        Dish dish2 = new Dish("salmon",30, DishType.FISH);
        Dish dish3 = new Dish("prawns", 40, DishType.FISH);
        Dish dish4 = new Dish("rice",40, DishType.OTHER);

        List<Dish> dises = List.of(dish, dish1, dish2, dish3, dish4);
        int i = reduce.sumCalories(dises);
        Assertions.assertThat(i).isEqualTo(140);
    }

    @Test
    void groupingTest() {
        Dish dish = new Dish("pork",10, DishType.MEAT);
        Dish dish1 = new Dish("chicken",20, DishType.MEAT);
        Dish dish2 = new Dish("salmon",30, DishType.FISH);
        Dish dish3 = new Dish("prawns", 40, DishType.FISH);
        Dish dish4 = new Dish("rice",40, DishType.OTHER);

        List<Dish> dises = List.of(dish, dish1, dish2, dish3, dish4);
        Map<DishType, List<Dish>> dishTypeListMap = grouping.groupingCalories(dises);
        Assertions.assertThat(dishTypeListMap.get(DishType.MEAT).size()).isEqualTo(2);
        Assertions.assertThat(dishTypeListMap.get(DishType.FISH).size()).isEqualTo(2);
        Assertions.assertThat(dishTypeListMap.get(DishType.OTHER).size()).isEqualTo(1);
    }


}