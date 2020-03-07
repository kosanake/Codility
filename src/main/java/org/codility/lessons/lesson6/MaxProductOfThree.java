package org.codility.lessons.lesson6;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {

        Arrays.sort(A);

        int length = A.length;
        int maxAllPositive = A[length - 1] * A[length - 2] * A[length - 3];
        int maxTwoNegative = A[length - 1] * A[0] * A[1];

        return Math.max(maxAllPositive, maxTwoNegative);
    }
}
