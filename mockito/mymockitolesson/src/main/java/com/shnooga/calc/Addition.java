package com.shnooga.calc;

public class Addition<T> implements MathIntf {
    public String calculate(Number val1, Number val2) {
        return val1.toString() + " + " + val2.toString();
    }
}
