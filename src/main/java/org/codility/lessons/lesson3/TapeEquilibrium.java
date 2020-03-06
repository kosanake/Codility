package org.codility.lessons.lesson3;

public class TapeEquilibrium {

    public int solution(int[] A) {

        long overallSum = 0;

        for (int i : A)
            overallSum += i;

        long minimum = Integer.MAX_VALUE;
        long leftSum = 0;
        for (int i = 1; i < A.length; i++) {
            leftSum += A[i - 1];
            overallSum -= A[i - 1];
            minimum = Math.min(Math.abs(minimum), Math.abs(leftSum - overallSum));
        }
        return (int) minimum;
    }
}
