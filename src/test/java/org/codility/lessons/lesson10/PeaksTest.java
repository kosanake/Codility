package org.codility.lessons.lesson10;

import org.junit.Test;

import static org.junit.Assert.*;

public class PeaksTest {

    @Test
    public void shouldSolution() {
        Peaks peaks = new Peaks();
        assertEquals(3, peaks.solution(new int[]{1,2,3,4,3,4,1,2,3,4,6,2}));
    }
}