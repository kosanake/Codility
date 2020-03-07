package org.codility.lessons.lesson5;

import org.junit.Test;

import static org.junit.Assert.*;

public class PassingCarsTest {

    @Test
    public void shouldSolution() {
        PassingCars passingCars = new PassingCars();
        assertEquals(5, passingCars.solution(new int[]{0,1,0,1,1}));
    }
}