package com.study.javainaction.comparing;

import com.study.javainaction.function.apple_ex_1.Apple;

import java.util.List;

public class Comparator {
    public static class AppleComparator implements java.util.Comparator<Apple> {
        public int compare(Apple a1, Apple a2) {
            return a1.getWeight().compareTo(a2.getWeight());
        }
    }


    public List<Apple> orderFunction(List<Apple> apples) {
        apples.sort(new AppleComparator());
        return apples;
    }


    public List<Apple> orderAnonymous(List<Apple> apples) {
        apples.sort(new java.util.Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        return apples;
    }

    public List<Apple> orderRamda(List<Apple> apples) {
        apples.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        return apples;
    }


    public List<Apple> orderMethod(List<Apple> apples) {
        apples.sort(java.util.Comparator.comparing(Apple::getWeight));
        return apples;
    }


    public List<Apple> orderCombination(List<Apple> apples) {
        apples.sort(java.util.Comparator.comparing(Apple::getWeight)
                .thenComparing(Apple::getColor)
        );
        return apples;
    }

}
