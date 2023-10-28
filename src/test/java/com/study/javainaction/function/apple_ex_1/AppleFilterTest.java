package com.study.javainaction.function.apple_ex_1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;



class AppleFilterTest {


    @Test
    void appleFilterTest() {

        Apple apple1 = new Apple(10, Color.RED);
        Apple apple2 = new Apple(17, Color.GREEN);
        Apple apple3 = new Apple(7, Color.RED);

        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);


        List<Apple> filterApples = AppleFilter.filterApples(apples, new AppleHeavyWeightPredicate());
        Assertions.assertThat(filterApples.size()).isEqualTo(1);
        Assertions.assertThat(filterApples.get(0).getColor()).isEqualTo(Color.GREEN);
    }
}