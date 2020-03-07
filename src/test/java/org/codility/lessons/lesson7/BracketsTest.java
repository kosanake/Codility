package org.codility.lessons.lesson7;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTest {

    @Test
    public void shouldSolution() {
        Brackets brackets = new Brackets();
        assertEquals(1, brackets.solution("{[()()]}"));
        assertEquals(0, brackets.solution("{[())]}"));
        assertEquals(1, brackets.solution(""));
        assertEquals(0, brackets.solution("{{{{"));
    }
}