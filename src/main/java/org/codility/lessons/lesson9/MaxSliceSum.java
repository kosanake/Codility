package org.codility.lessons.lesson9;

public class MaxSliceSum {
    public int solution(int[] A) {
        int maxAtCurrentPosition = 0;
        int maxSum = 0;

        if (A.length == 1)
            return A[0];

        boolean allNegative = true;
        int maxNegativeElement = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            maxNegativeElement = Math.max(maxNegativeElement, A[i]);
            if (A[i] > 0) {
                allNegative = false;
                break;
            }
        }

        if (allNegative)
            return maxNegativeElement;

        for (int i = 0; i < A.length; i++) {
            maxAtCurrentPosition = Math.max(0, maxAtCurrentPosition + A[i]);
            maxSum = Math.max(maxAtCurrentPosition, maxSum);
        }
        return maxSum;
    }
}
