package org.codility.lessons.lesson7;

import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {

    @Test
    public void shouldSolution() {
        Fish fish = new Fish();
        assertEquals(2, fish.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
        assertEquals(2, fish.solution(new int[]{9, 3, 0, 1, 5}, new int[]{1, 0, 0, 0, 1}));
        assertEquals(4, fish.solution(new int[]{0, 1, 3, 4, 9}, new int[]{0, 1, 0, 0, 0}));
        assertEquals(5, fish.solution(new int[]{0, 1, 3, 4, 9}, new int[]{0, 0, 0, 0, 0}));
        assertEquals(5, fish.solution(new int[]{0, 1, 3, 4, 9}, new int[]{1, 1, 1, 1, 1}));
        assertEquals(1, fish.solution(new int[]{1}, new int[]{1}));
        assertEquals(3, fish.solution(new int[]{4, 3, 2, 5, 5}, new int[]{0, 1, 1, 0, 0}));
    }
}