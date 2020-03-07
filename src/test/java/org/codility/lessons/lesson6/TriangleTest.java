package org.codility.lessons.lesson6;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void shouldSolution() {
        Triangle triangle = new Triangle();
        assertEquals(1, triangle.solution(new int[]{10,2,5,1,8,20}));
        assertEquals(0, triangle.solution(new int[]{10,50,5,1}));
        assertEquals(1, triangle.solution(new int[]{5,3,3}));
        assertEquals(1, triangle.solution(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE}));
    }
}