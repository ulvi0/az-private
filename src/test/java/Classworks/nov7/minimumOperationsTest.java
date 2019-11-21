package Classworks.nov7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class minimumOperationsTest {
    minimumOperations app = new minimumOperations();
    @Before
    public void before(){
        app = new minimumOperations();
    }
    @Test
    public void solution() {
        String from = "ulvi";
        String to = "op";
        assertEquals(4, app.solution(from, to));
    }
}