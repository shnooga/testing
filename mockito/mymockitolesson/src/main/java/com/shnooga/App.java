package com.shnooga;

import com.shnooga.calc.Addition;
import com.shnooga.calc.MathIntf;
import com.shnooga.calc.Multiplication;

public class App
{
    private MathIntf add = new Addition<Long>();
    private MathIntf mult = new Multiplication();


    public String add(long val1, long val2) {
        return add.calculate(new Long(val1), new Long(val2));
    }

    public String multiply(long val1, long val2) {
        return mult.calculate(new Long(val1), new Long(val2));
    }
}
