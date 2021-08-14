package com.github.pknall.PredefinedFunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {


    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();

        System.out.println("Lambda: Length = " + func.apply("function"));
    }
}
