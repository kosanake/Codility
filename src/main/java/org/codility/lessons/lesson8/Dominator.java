package org.codility.lessons.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public int solution(int[] A) {

        Map<Integer, Integer> numbersCount = new HashMap<>();
        HashMap<Integer, Integer> numbersIndexes = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            numbersCount.merge(A[i], 1, Integer::sum);
            numbersIndexes.put(A[i], i);
        }

        for (Map.Entry<Integer, Integer> entry : numbersCount.entrySet()) {
            if (entry.getValue() > A.length / 2)
                return numbersIndexes.get(entry.getKey());
        }

        return -1;
    }
}
