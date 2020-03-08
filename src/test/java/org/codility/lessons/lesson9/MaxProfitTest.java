package org.codility.lessons.lesson9;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitTest {

    @Test
    public void solution() {
        MaxProfit maxProfit = new MaxProfit();
        assertEquals(356, maxProfit.solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }
}