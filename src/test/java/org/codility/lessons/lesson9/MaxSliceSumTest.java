package org.codility.lessons.lesson9;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSliceSumTest {

    @Test
    public void shouldSolution() {
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        assertEquals(5, maxSliceSum.solution(new int[]{3, 2, -6, 4, 0}));
    }
}