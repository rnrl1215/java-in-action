package com.study.javainaction.function.fuction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class LetterFunctionTest {

    @Test
    void LetterTest() {
        Function<String, String> a = LetterFunction::addHeader;
        Function<String, String> stringStringFunction = a.andThen(LetterFunction::addFooter);
        String test1 = stringStringFunction.apply("text");
        org.assertj.core.api.Assertions.assertThat(test1).isEqualTo("Hello text Address: a");
    }

}