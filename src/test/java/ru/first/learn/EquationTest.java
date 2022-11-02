package ru.first.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTest {

    @Test
    public void test0(){
        Equation e = new Equation(1,1,1);
        Assert.assertEquals(e.rootnumber(),0);
    }

    @Test
    public void test1(){
        Equation e = new Equation(1,2,1);
        Assert.assertEquals(e.rootnumber(),1);
    }

    @Test
    public void test2(){
        Equation e = new Equation(1,5,6);
        Assert.assertEquals(e.rootnumber(),2);
    }

    @Test
    public void testLine(){
        Equation e = new Equation(0,1,0);
        Assert.assertEquals(e.rootnumber(),1);
    }

    @Test
    public void testConst(){
        Equation e = new Equation(0,0,1);
        Assert.assertEquals(e.rootnumber(),0);
    }

    @Test
    public void testZero(){
        Equation e = new Equation(0,0,0);
        Assert.assertEquals(e.rootnumber(),-1);
    }
}
