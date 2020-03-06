package org.codility.lessons.lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxCountersTest {

    @Test
    public void shouldSolution() {
        MaxCounters maxCounters = new MaxCounters();
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
}