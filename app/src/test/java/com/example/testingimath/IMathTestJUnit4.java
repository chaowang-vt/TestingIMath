package com.example.testingimath;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/** A JUnite class to test the class IMath. */
public class IMathTestJUnit4 {
    private IMath tester;

    /** Setup method executed before each test */
    @Before
    public void setup() {
        tester = new IMath();
    }
    /** JUnit test methods to test isqrt. */
    @Test
    public void testIsqrt0() {
        assertEquals("square root for 0", 0, tester.isqrt(0));
    }
    @Test
    public void testIsqrt1() {
        assertEquals("square root for 1", 1, tester.isqrt(1));
    }
    @Test
    public void testIsqrt2() {
        assertEquals("square root for 2", 1, tester.isqrt(2));
    }
    @Test
    public void testIsqrt3() {
        assertEquals("square root for 3", 1, tester.isqrt(3));
    }
    @Test
    public void testIsqrt100() {
        assertEquals("square root for 100", 10, tester.isqrt(100));
    }

}
