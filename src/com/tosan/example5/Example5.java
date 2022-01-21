package com.tosan.example5;

import java.util.Comparator;

public class Example5 {

    public Example5(Customer customer1, Customer customer2){

    }
    public Example5(){

    }
    public Example5(Customer customer1){

    }

    public static void main(String[] args) {
        java.util.Comparator<Customer> comparator = new java.util.Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return 1;
            }
        };
        java.util.Comparator<Customer> comparator1 = (t, u) -> 1;
        Example5 example5 = new Example5(null, null);
        java.util.Comparator<Customer> comparator2 = example5::print;
        Comparator comparator3 = Example5::new;

    }

    public int print(Customer customer1, Customer customer2){
        return 1;
    }

    interface Comparator{
        void compare();
    }
}
