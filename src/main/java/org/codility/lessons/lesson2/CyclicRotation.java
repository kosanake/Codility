package org.codility.lessons.lesson2;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int pos = (i + K) % A.length;
            result[pos] = A[i];
        }

        return result;
    }

}