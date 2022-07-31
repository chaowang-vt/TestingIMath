package com.example.testingimath;

import org.junit.Test;
import static org.junit.Assert.*;

/** A JUnite class to test the class IMath. */
public class IMathTestJUnit2 {

    /** A JUnit test method to test isqrt. */
    @Test
    public void testIsqrt() {
        IMath tester = new IMath();
        assertEquals(0, tester.isqrt(0));
        assertEquals(1, tester.isqrt(1));
        assertEquals(1, tester.isqrt(2));
        assertEquals(1, tester.isqrt(3));
        assertEquals(10, tester.isqrt(100));
    }

}
