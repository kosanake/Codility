package org.codility.lessons.lesson5;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinAvgTwoSliceTest {

    @Test
    public void shouldSolution() {
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        assertEquals(1, minAvgTwoSlice.solution(new int[]{4,2,2,5,1,5,8}));
        assertEquals(1, minAvgTwoSlice.solution(new int[]{4,0,0,1,1,5,8}));
        assertEquals(2, minAvgTwoSlice.solution(new int[]{4,1,0,0,0,1,8}));
    }
}