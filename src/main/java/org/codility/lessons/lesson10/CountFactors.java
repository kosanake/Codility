package org.codility.lessons.lesson10;

public class CountFactors {
    public int solution(int N) {
        int factorsNumber = 0;
        int sq = (int) Math.sqrt(N);

        for (int i = 1; i <= sq; i++) {
            if (N % i == 0)
                factorsNumber++;
        }

        factorsNumber *= 2;

        if (sq * sq == N)
            factorsNumber--;

        return factorsNumber;
    }
}
