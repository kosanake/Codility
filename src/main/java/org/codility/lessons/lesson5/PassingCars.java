package org.codility.lessons.lesson5;

public class PassingCars {
    public int solution(int[] A) {

        int[] prefixSum = new int[A.length + 1];
        for (int i = 1; i <= A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i - 1];
        }

        int pairs = 0;
        for (int i = A.length; i > 0; i--) {
            if (A[i - 1] == 0) {
                pairs += prefixSum[A.length] - prefixSum[i - 1];
                if (pairs > 1_000_000_000) {
                    return -1;
                }
            }
        }

        return pairs;
    }
}
