package org.codility.lessons.lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermCheckTest {

    @Test
    public void shouldSolution() {
        PermCheck permCheck = new PermCheck();
        assertEquals(1, permCheck.solution(new int[]{4, 3, 1, 2}));
        assertEquals(1, permCheck.solution(new int[]{1}));
        assertEquals(0, permCheck.solution(new int[]{1, 3}));
    }
}