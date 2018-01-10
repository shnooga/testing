package com.shnooga.calc;

public interface MathIntf<T extends Number> {
    String calculate(T val1, T val2);
}
