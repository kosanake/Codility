package org.codility.lessons.lesson8;

import org.junit.Test;

import static org.junit.Assert.*;

public class EquiLeaderTest {

    @Test
    public void shouldSolution() {
        EquiLeader equiLeader = new EquiLeader();
        assertEquals(2, equiLeader.solution(new int[]{4, 3, 4, 4, 4, 2}));
    }
}