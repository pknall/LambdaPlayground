package com.github.pknall.PredefinedFunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Lambda: Supplied String";

        System.out.println(supplier.get());
    }
}
