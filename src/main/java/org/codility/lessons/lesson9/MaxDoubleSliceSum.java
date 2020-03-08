package org.codility.lessons.lesson9;

public class MaxDoubleSliceSum {
    public int solution(int[] A) {

        int left[] = new int[A.length];
        int right[] = new int[A.length];

        for (int i = 1; i < A.length; i++)
            left[i] = Math.max(0, left[i - 1] + A[i]);

        for (int i = A.length - 2; i >= 0; i--)
            right[i] = Math.max(0, right[i + 1] + A[i]);

        int max = 0;
        for (int i = 1; i < A.length - 1; i++) {
            int sum = left[i - 1] + right[i + 1];
            if (sum > max)
                max = sum;
        }

        return max;
    }
}
