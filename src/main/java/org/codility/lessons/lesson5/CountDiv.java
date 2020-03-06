package org.codility.lessons.lesson5;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int addon = 0;
        int devisableB = B / K;
        int devisableA = A / K;
        int diff = devisableB - devisableA;
        if (A % K == 0)
            addon = 1;
        return diff + addon;
    }
}
