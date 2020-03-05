package org.codility.lessons.lesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

    @Test
    public void shoudSolve() {
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(0, binaryGap.solution(0));
        assertEquals(1, binaryGap.solution(10));
        assertEquals(3, binaryGap.solution(10000));
        assertEquals(4, binaryGap.solution(103874));
        assertEquals(9, binaryGap.solution(2000000001));
    }
}