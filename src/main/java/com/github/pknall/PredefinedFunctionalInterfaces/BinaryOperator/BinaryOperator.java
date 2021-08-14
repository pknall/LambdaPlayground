package com.github.pknall.PredefinedFunctionalInterfaces.BinaryOperator;

import java.util.function.BiFunction;

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,T,T> {
}
