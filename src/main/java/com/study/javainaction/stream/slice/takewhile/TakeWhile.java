package com.study.javainaction.stream.slice.takewhile;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhile {
    public List<String> getNumber(List<String> strings) {
       return strings.stream().filter(s -> {
            try {

                Integer.parseInt(s);
                return true;
            } catch (Exception e) {
                return false;
            }
        }).collect(Collectors.toList());
    }

    public List<String> getNumberTakeWhile(List<String> strings) {
        return strings.stream().takeWhile(s -> {
            try {

                Integer.parseInt(s);
                return true;
            } catch (Exception e) {
                return false;
            }
        }).collect(Collectors.toList());
    }
}
