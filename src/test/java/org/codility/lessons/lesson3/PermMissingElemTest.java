package org.codility.lessons.lesson3;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTest {

    @Test
    public void shouldSolution() {
        PermMissingElem permMissingElem = new PermMissingElem();
        assertEquals(4, permMissingElem.solution(new int[]{1, 2, 3, 5, 6}));
        assertEquals(5, permMissingElem.solution(new int[]{1, 2, 3, 4, 6}));
    }
}