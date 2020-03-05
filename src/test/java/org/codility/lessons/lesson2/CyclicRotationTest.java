package org.codility.lessons.lesson2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicRotationTest {

    @Test
    public void shouldSolution() {
        CyclicRotation rotation = new CyclicRotation();
        assertArrayEquals(new int[] {4, 0, 1, 2, 3}, rotation.solution(new int[]{0, 1, 2, 3, 4}, 1));
        assertArrayEquals(new int[] {0, 0, 0, 0, 0}, rotation.solution(new int[]{0, 0, 0, 0, 0}, 1000000000));
    }
}