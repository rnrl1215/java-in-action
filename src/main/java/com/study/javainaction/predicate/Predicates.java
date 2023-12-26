package com.study.javainaction.predicate;

import com.study.javainaction.function.apple_ex_1.Apple;
import com.study.javainaction.function.apple_ex_1.Color;

import java.util.function.Predicate;

public class Predicates {
    public Predicate<Apple> notRed() {
        Predicate<Apple> redApple = new Predicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals(Color.RED);
            }
        };

        return redApple.negate();
    }
}
