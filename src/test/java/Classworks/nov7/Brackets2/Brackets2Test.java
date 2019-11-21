package Classworks.nov7.Brackets2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Brackets2Test {
    Brackets2 app;
    @Before
    public void before(){
        app = new Brackets2();
    }

    @Test
    public void solutionTest1() {
        String origin = "(sdfsdf)sd(fdfsd(sdfdf)dfd)";
        List<String> actual  = app.solution(origin);
        List<String> expected = new ArrayList<>();
        expected.add("sdfsdf");
        expected.add("sd");
        expected.add("fdfsd");
        expected.add("sdfdf");
        expected.add("dfd");
        assertEquals(expected, actual);

    }
}