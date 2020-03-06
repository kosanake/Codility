package org.codility.lessons.lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingIntegerTest {

    @Test
    public void shouldSolution() {
        MissingInteger missingInteger = new MissingInteger();
        assertEquals(1, missingInteger.solution(new int[]{-100, 0, 2, 4, 8}));
        assertEquals(3, missingInteger.solution(new int[]{-100, -10, 1, 2, 4, 8}));
        assertEquals(1, missingInteger.solution(new int[]{8}));
    }
}