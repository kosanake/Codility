package org.codility.lessons.lesson6;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if((long)A[i] + (long) A[i + 1] > (long)A[i + 2]
                    && (long)A[i] + (long)A[i + 2] > (long)A[i + 2]
                    && (long)A[i + 1] + (long)A[i + 2] > (long)A[i]) {
                return 1;
            }
        }
        return 0;
    }
}
