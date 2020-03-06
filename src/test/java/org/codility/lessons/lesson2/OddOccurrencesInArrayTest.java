package org.codility.lessons.lesson2;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest {

    @Test
    public void shoudSolution() {
        OddOccurrencesInArray occ = new OddOccurrencesInArray();
        assertEquals(7, occ.solution(new int[]{1, 3, 7, 1, 3}));
        assertEquals(7, occ.solution(new int[]{1, 3, 7, 1, 3}));
        assertEquals(9, occ.solution(new int[]{1, 3, 7, 1, 3, 1, 1, 7, 9}));
    }
}