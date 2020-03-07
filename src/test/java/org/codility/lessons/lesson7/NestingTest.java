package org.codility.lessons.lesson7;

import org.junit.Test;

import static org.junit.Assert.*;

public class NestingTest {

    @Test
    public void shouldSolution() {
        Nesting nesting = new Nesting();
        assertEquals(1, nesting.solution("(()(())())"));
        assertEquals(0, nesting.solution("(()(()())"));
        assertEquals(1, nesting.solution(""));
    }
}