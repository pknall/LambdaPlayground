package com.github.pknall.PredefinedFunctionalInterfaces;

import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class UnaryOperatorExampleTest {

    @Test
    void applyTest() {
        UnaryOperatorExample uoe = new UnaryOperatorExample();
        UnaryOperator<String> extentionAdder = (String text) -> { return text + ".txt"; };

        String text = "lambda-tutorial";
        String newString = uoe.apply(text);
        System.out.println("Using Class: " + newString);
        System.out.println("Using Lambda: " + extentionAdder.apply(text));
    }
}