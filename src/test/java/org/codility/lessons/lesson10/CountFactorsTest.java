package org.codility.lessons.lesson10;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountFactorsTest {
    @Test
    public void shouldSolution() {
        CountFactors countFactors = new CountFactors();
        assertEquals(8, countFactors.solution(24));
        assertEquals(1, countFactors.solution(1));
    }
}