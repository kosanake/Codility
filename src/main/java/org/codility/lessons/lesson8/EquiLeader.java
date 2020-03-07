package org.codility.lessons.lesson8;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {
    public int solution(int[] A) {

        Map<Integer, Integer> numbersCount = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            numbersCount.merge(A[i], 1, Integer::sum);
        }

        int leader = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : numbersCount.entrySet()) {
            if (entry.getValue() > A.length / 2)
                leader = entry.getKey();
        }

        if (Integer.MIN_VALUE == leader)
            return 0;

        int[] prefixSum = new int[A.length + 1];
        for (int i = 1; i <= A.length; i++) {
            int diff = 0;
            if (A[i - 1] == leader)
                diff = 1;
            prefixSum[i] = diff + prefixSum[i - 1];
        }

        int leaderEquiCount = 0;
        for (int i = 1; i < A.length; i++) {
            int left = prefixSum[i];
            int righ = prefixSum[A.length] - prefixSum[i];
            if (left > i / 2 && righ > (A.length - i) / 2) {
                leaderEquiCount++;
            }
        }

        return leaderEquiCount;
    }
}
