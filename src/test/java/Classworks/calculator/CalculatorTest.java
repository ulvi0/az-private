package Classworks.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    int a, b;
    Calculator cal;

    @Before
    public void before(){
         cal = new Calculator();
        a =(int) Math.random() * 100 + 1;
        b =(int) Math.random() * 100 + 1;
    }
    @Test
    public void add() {
        int add = cal.add(a, b);
        assertEquals(a + b, add);
    }

    @Test
    public void sub() {
        int sub = cal.sub(a, b);
        assertEquals(a - b, sub);
    }

    @Test
    public void mul() {
        int mul = cal.mul(a, b);
        assertEquals(a * b, mul);
    }

    @Test
    public void div() {
        int div = cal.div(a, b);
        assertEquals(a / b, div);
    }
}