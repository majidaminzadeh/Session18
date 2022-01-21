package com.tosan.example2;

import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        Stream<String> stream1 = Stream.of("1", "2", "3");
        stream1.forEach(System.out::println);
        Stream<String> stream2 = Stream.<String>builder().add("4").add("5").build();
        stream2.forEach(System.out::println);
        Stream<String> stream3 = Stream.generate(()->"1").limit(20);
        stream3.forEach(System.out::println);
        Stream<Integer> stream4 = Stream.iterate(0, t-> t+2).limit(20);
        stream4.forEach(System.out::println);
    }
}
