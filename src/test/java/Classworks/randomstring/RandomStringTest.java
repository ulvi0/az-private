package Classworks.randomstring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomStringTest {
     RandomString t;
     String generated;

    @Before
    public void before(){
        t = new RandomString();
        generated = t.generateRandomString(10);
    }



    @Test
    public void randomString1() {

        assertEquals(10, generated.length());
    }



    @Test
    public void randomString2() {
        for(int i = 0; i < 10; i++) {
            assertTrue(Character.isAlphabetic(generated.charAt(0)));
        }
    }
    @Test
    public void randomString3() {
        RandomString t = new RandomString();
        String generated = t.generateRandomString(10);

    }
}