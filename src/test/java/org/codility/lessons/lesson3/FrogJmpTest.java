package org.codility.lessons.lesson3;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJmpTest {

    @Test
    public void shoudSolution() {
        FrogJmp frogJmp = new FrogJmp();
        assertEquals(9, frogJmp.solution(1, 10, 1));
        assertEquals(999_999_999, frogJmp.solution(1, 1_000_000_000, 1));
        assertEquals(0, frogJmp.solution(1, 1, 3));
        assertEquals(3, frogJmp.solution(10, 85, 30));
    }
}