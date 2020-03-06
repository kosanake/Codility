package org.codility.lessons.lesson3;

public class PermMissingElem {
    public int solution(int[] A) {

        long sum = (1 + A.length + 1) * (A.length + 1) / 2;
        for (int i = 0; i < A.length; i++)
            sum -= A[i];

        return (int) sum;
    }
}
