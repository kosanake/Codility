package org.codility.lessons.lesson10;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinPerimeterRectangleTest {

    @Test
    public void solution() {
        MinPerimeterRectangle perimeter = new MinPerimeterRectangle();
        assertEquals(22, perimeter.solution(30));
    }
}