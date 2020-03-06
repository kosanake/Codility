package org.codility.lessons.lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogRiverOneTest {

    @Test
    public void shouldSolution() {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        assertEquals(6, frogRiverOne.solution(5, new int[]{1, 1, 1, 2, 4, 3, 5, 4, 3}));
        assertEquals(0, frogRiverOne.solution(1, new int[]{1, 1, 1, 2, 4, 3, 5, 4, 3}));
        assertEquals(-1, frogRiverOne.solution(12, new int[]{1, 1, 1, 2, 4, 8, 5, 4, 3}));
        assertEquals(-1, frogRiverOne.solution(0, new int[]{1, 1, 1, 2, 4, 8, 5, 4, 3}));
    }
}