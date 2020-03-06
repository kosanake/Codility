package org.codility.lessons.lesson3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {

    @Test
    public void shouldSolution() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
        assertEquals(10, tapeEquilibrium.solution(new int[]{30, 10, 20, 40, 30}));
        assertEquals(2, tapeEquilibrium.solution(new int[]{3, 1}));
    }
}