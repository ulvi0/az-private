package Classworks.oct31;
import Classworks.oct31.Warmups.Fractions.FractionsApp;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionsAppTest {

    @Test
    public void sumFractionsTest1() {
        String string = "3/6+4/5+1/10";
        FractionsApp app = new FractionsApp();
        String result = app.sumFractions(string);
        assertEquals(result, "7/5");
    }
    @Test
    public void sumFractionsTest2() {
        String string = "1/2+4/7+5/7";
        FractionsApp app = new FractionsApp();
        String result = app.sumFractions(string);
        assertEquals(result, "25/14");
    }
    @Test
    public void sumFractionsTest3() {
        String string = "3/1+2/6+1/9";
        FractionsApp app = new FractionsApp();
        String result = app.sumFractions(string);
        assertEquals(result, "31/9");
    }
    @Test
    public void sumFractionsTest4() {
        String string = "3/1+4/8+1/2+7/8";
        FractionsApp app = new FractionsApp();
        String result = app.sumFractions(string);
        assertEquals(result, "39/8");
    }
    @Test
    public void sumFractionsTest5() {
        String string = "2/9+4/1+6/2+2/3";
        FractionsApp app = new FractionsApp();
        String result = app.sumFractions(string);
        assertEquals(result, "71/9");
    }

}