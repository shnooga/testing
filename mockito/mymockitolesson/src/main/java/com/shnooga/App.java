package com.shnooga;

import com.shnooga.calc.Add;
import com.shnooga.calc.MathIntf;
import com.shnooga.calc.Multiply;

public class App
{
    private MathIntf add = new Add<Long>();
    private MathIntf mult = new Multiply();


    public String add(long val1, long val2) {
        return add.calculate(new Long(val1), new Long(val2));
    }

    public String multiply(long val1, long val2) {
        return mult.calculate(new Long(val1), new Long(val2));
    }
}
