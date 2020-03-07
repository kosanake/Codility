package org.codility.lessons.lesson6;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctTest {

    @Test
    public void shouldSolution() {
        Distinct distinct = new Distinct();
        assertEquals(6, distinct.solution(new int[]{0,0,0,2,3,2,-100000,33,33,4}));
        assertEquals(1, distinct.solution(new int[]{0,0,0}));
        assertEquals(0, distinct.solution(new int[]{}));
    }
}