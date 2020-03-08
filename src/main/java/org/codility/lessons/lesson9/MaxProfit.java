package org.codility.lessons.lesson9;

public class MaxProfit {

    public int solution(int[] A) {

        if (A.length < 2)
            return 0;

        int maxProfit = 0;
        int minimumPrice = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] < minimumPrice) {
                minimumPrice = A[i];
            } else {
                maxProfit = Math.max(A[i] - minimumPrice, maxProfit);
            }
        }
        return maxProfit;
    }
}
