package com.github.pknall.PredefinedFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample implements UnaryOperator<String> {

    public String apply(String text) {
        return text + ".txt";
    }
}

class UnaryOperatorTest {
    public static void main(String args[]) {
        UnaryOperatorExample uoe = new UnaryOperatorExample();

        String text = "lambda-tutorial";
        String newString = uoe.apply(text);
        System.out.println(newString);
    }
}
