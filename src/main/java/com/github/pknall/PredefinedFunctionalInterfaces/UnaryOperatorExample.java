package com.github.pknall.PredefinedFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample implements UnaryOperator<String> {
    public String apply(String text) {
        return text + ".txt";
    }
}
