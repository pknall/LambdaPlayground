package com.github.pknall.PredefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> n > 0;

        System.out.println("Lambda: " + predicate.test(2));
    }

}
