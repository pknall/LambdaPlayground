package com.github.pknall.PredefinedFunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a+b;

        System.out.println("Lambda: Result: " + binaryOperator.apply(2,3));
    }
}
