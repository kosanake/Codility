package org.codility.lessons.lesson6;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {

        long[] leftPoints = new long[A.length];
        long[] rightPoints = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            leftPoints[i] = i - A[i];
            rightPoints[i] = i + A[i];
        }

        Arrays.sort(leftPoints);
        Arrays.sort(rightPoints);

        int inner = 0;
        long intersections = 0;
        for (int i = 0; i < A.length; i++) {
            while (inner < A.length && rightPoints[i] >= leftPoints[inner]) {
                intersections = intersections - i;
                intersections = intersections + inner;
                inner++;
            }
        }

        if (intersections > 10_000_000)
            return -1;

        return (int) intersections;
    }
}
