package com.github.pknall.PredefinedFunctionalInterfaces.BinaryOperator;

import java.util.function.BiFunction;

public class Java8BinaryOperator1 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;

        Integer result = func.apply(2, 3);

        System.out.println(result);
    }
}
