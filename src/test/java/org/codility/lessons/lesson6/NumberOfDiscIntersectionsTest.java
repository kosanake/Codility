package org.codility.lessons.lesson6;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDiscIntersectionsTest {

    @Test
    public void shouldSolution() {
        NumberOfDiscIntersections number = new NumberOfDiscIntersections();
        assertEquals(11, number.solution(new int[]{1,5,2,1,4,0}));
    }
}