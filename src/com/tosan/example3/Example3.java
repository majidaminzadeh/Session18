package com.tosan.example3;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4,6);
        intStream.forEach(System.out::println);
        IntStream intStream1 = IntStream.rangeClosed(1,10);
        intStream1.forEach(System.out::println);
    }
}
