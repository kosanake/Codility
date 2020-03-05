package org.codility.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    @Test
    public void shoudSolve() {
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(0, binaryGap.solve(0));
        assertEquals(1, binaryGap.solve(10));
        assertEquals(3, binaryGap.solve(10000));
        assertEquals(4, binaryGap.solve(103874));
        assertEquals(9, binaryGap.solve(2000000001));
    }
}