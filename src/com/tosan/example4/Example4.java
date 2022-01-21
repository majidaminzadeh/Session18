package com.tosan.example4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Thread that runs in main method is:" + Thread.currentThread().getName());
        List<Integer> list = Arrays.asList(2,3,5,10,6);
        int sum = list.stream().parallel().reduce(1, (t,u)->{
            System.out.println("------------------");
            System.out.println(Thread.currentThread().getName());
            System.out.println("T is " + t + " and U is "+u);
            System.out.println("------------------");
            return t+u;
        });

        System.out.println(sum);

        Optional<Integer> max = list.stream().parallel().max((u, t) -> {
            System.out.println("------------------");
            System.out.println("Now is " + Calendar.getInstance().getTimeInMillis());
            System.out.println(Thread.currentThread().getName());
            System.out.println("T is " + t + " and U is "+u);
            System.out.println("------------------");
            return u.compareTo(t);
        });
        System.out.println(max.get());
    }
}
