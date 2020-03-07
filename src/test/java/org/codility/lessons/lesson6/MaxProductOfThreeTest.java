package org.codility.lessons.lesson6;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProductOfThreeTest {

    @Test
    public void shouldSolution() {
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        assertEquals(0, maxProductOfThree.solution(new int[]{0, 0, 0}));
        assertEquals(12, maxProductOfThree.solution(new int[]{1, -1, 3, 4, -1, 0}));
        assertEquals(4400, maxProductOfThree.solution(new int[]{1, -1100, 3, 4, -1, 0}));
    }
}