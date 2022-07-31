package com.example.testingimath;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.Collection;

/** A JUnite class to test the class IMath. */
@RunWith(Parameterized.class)
public class IMathTestJUnitParameterized {
    private IMath tester;
    private int input, expectedOutput;

    /** Constructor method to accept each input-output pair */
    public IMathTestJUnitParameterized(int in, int expectedOut) {
        this.input = in;
        this.expectedOutput = expectedOut;
    }
    /** Setup method to create the test fixture */
    @Before
    public void setup() {
        tester = new IMath();
    }

    /** Store input-output pairs of the test data */
    @Parameterized.Parameters
    public static Collection<Object[]> valuePairs() {
        Object[][] testData = { {0,0}, {1,1}, {2,1}, {3,1}, {100,10}};
        return Arrays.asList(testData);
    }

    /** JUnit test method to test isqrt. */
    @Test
    public void testIsqrt() {
        assertEquals("square root for " + input, expectedOutput, tester.isqrt(input));
    }

}
