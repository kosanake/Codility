package org.codility.lessons.lesson9;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDoubleSliceSumTest {
    @Test
    public void shouldSolution() {
        MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();
        assertEquals(17, maxDoubleSliceSum.solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2}));
    }
}