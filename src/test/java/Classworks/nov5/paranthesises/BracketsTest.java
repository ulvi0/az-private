package Classworks.nov5.paranthesises;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class BracketsTest {
    Brackets app;
    @Before
    public void before(){
        app = new Brackets();
    }
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Test
    public void calc1_should_ok(){
        assertEquals(1, app.calc("()()()()()"));
    }
    @Test
    public void calc2_should_ok(){
        assertEquals(2, app.calc("(()()()()())"));
    }
    @Test
    public void calc3_should_ok(){
       assertEquals(3,  app.calc("()((()))()(())()"));
    }
    @Test
    public void calc4_should_ok(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Extra Closing Bracket.");
        app.calc("()(()))()(()()");
    }
    @Test
    public void calc5_should_ok(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Extra Opening Bracket.");
        app.calc("()((()))(())()(");
    }

    @Test
    public void calc6_should_ok(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Wrong character.");
        app.calc("()(e))()(");
    }


}