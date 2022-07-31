package com.example.testingimath;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.*;

/** A JUnite class to test the class IMath. */
public class IMathTestJUnit1 {

    /** A JUnit test method to test isqrt. */
    @Test
    public void testIsqrt() {
        IMath tester = new IMath();
        assertTrue(0 == tester.isqrt(0));
        assertTrue(1 == tester.isqrt(1));
        assertTrue(1 == tester.isqrt(2));
        assertTrue(1 == tester.isqrt(3));
        assertTrue(10 == tester.isqrt(100));
    }

}
