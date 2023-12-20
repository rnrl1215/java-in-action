package com.study.javainaction.predicate;

import com.study.javainaction.function.apple_ex_1.Apple;
import com.study.javainaction.function.apple_ex_1.Color;

public class RedApplePredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.RED);
    }
}
