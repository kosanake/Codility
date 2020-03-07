package org.codility.lessons.lesson8;

import org.junit.Test;

import static org.junit.Assert.*;

public class DominatorTest {

    @Test
    public void shouldSolution() {
        Dominator dominator = new Dominator();
        assertEquals(7, dominator.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
    }
}