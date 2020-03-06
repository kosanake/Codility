package org.codility.lessons.lesson4;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counter = new int[N];

        int maxCounter = 0;
        int appliedMaxCounter = 0;

        for (int i = 0; i < A.length; i++) {
            int value = A[i];
            if(value > 0 && value <= N) {
                if (counter[value - 1] < appliedMaxCounter)
                    counter[value - 1] = appliedMaxCounter;
                counter[value - 1]++;
                maxCounter = Math.max(maxCounter, counter[value - 1]);
            } else if (value == N + 1) {
                appliedMaxCounter = maxCounter;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] < appliedMaxCounter)
                counter[i] = appliedMaxCounter;
        }

        return counter;
    }
}
