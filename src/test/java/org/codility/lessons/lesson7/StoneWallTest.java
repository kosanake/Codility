package org.codility.lessons.lesson7;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoneWallTest {

    @Test
    public void shouldSolution() {
        StoneWall stoneWall = new StoneWall();
        assertEquals(7, stoneWall.solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4 ,8}));
    }
}