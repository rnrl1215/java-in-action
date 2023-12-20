package com.study.javainaction.predicate;

import com.study.javainaction.function.apple_ex_1.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 15;
    }
}
