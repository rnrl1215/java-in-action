package com.study.javainaction.stream.ex;

import com.study.javainaction.model.Trader;
import com.study.javainaction.model.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// 문제 풀이
public class ex1 {

    // 2011 년에 일어난 모든 트랙잭션
    public List<Transaction> findTransaction(List<Transaction> transactions) {
        return transactions.stream().filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    // 거래자가 근무하는 모든 도시 중복값 제거
    public List<String> getDistinctCity(List<Transaction> transactions) {
        return transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    // 케임브리지에서 근무하는 모든 거래자 이름순 정렬
    public List<Trader> findTraderNameByCity(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
    }

    public String getTraderNameString (List<Transaction> transactions) {
        return transactions.stream()
                .map( t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (l1, l2) -> l1 + l2);
    }


    public Optional<Integer> maxValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
    }
}
