package org.codility.lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int X, int[] A) {

        Set<Integer> positions = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                positions.add(A[i]);
                if (positions.size() == X) {
                    return i;
                }
            }
        }

        return -1;
    }
}
