package Classworks.nov7.Shoes;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ShoesTest {
    Shoes app;
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Before
    public void before(){
        app = new Shoes();
    }
    @Test
    public void solutionTest1() {
        String origin = "RLLLRRRLLR";
        assertEquals(4, app.solution(origin));
    }
    @Test
    public void solutionTest2() {
        String origin = "LLRLRLRLRLRLRR";
        assertEquals(1, app.solution(origin));
    }
    @Test
    public void solutionTest3() {
        String origin = "RLRL";
        assertEquals(2, app.solution(origin));
    }
    @Test
    public void solutionTest4() {
        String origin = "RLRRLLRLRRLL";
        assertEquals(4, app.solution(origin));
    }
    @Test
    public void solutionTest5() {
        String origin = "RLRRLL";
        assertEquals(2, app.solution(origin));
    }
    @Test
    public void solutionTest6() {
        String origin = "RLRRLR";
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Extra R character.");
        app.solution(origin);
    }
}
