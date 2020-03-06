package org.codility.lessons.lesson5;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDivTest {

    @Test
    public void shouldSolution() {
        CountDiv countDiv = new CountDiv();
        assertEquals(3, countDiv.solution(3, 9, 3));
        assertEquals(5, countDiv.solution(1, 10, 2));
        assertEquals(1, countDiv.solution(0, 0, 1));
        assertEquals(1, countDiv.solution(10, 10, 5));
    }
}