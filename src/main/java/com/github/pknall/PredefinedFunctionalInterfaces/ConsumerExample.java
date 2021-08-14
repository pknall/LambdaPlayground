package com.github.pknall.PredefinedFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> display = a ->System.out.println(a);

        display.accept("Lambda: Display me");
    }
}
