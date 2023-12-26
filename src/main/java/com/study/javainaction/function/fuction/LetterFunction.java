package com.study.javainaction.function.fuction;

import java.util.SplittableRandom;

public class LetterFunction {
    public static String addFooter(String s) {
        return s.concat(" Address: a");
    }

    public static String addHeader(String s) {
        return "Hello ".concat(s);
    }
}
