package org.codility.lessons.lesson10;

public class MinPerimeterRectangle {
    public int solution(int N) {
        int perimeter = N * 2;
        int sq = (int) Math.sqrt(N);

        for (int i = sq; i > 0; i--) {
            if (N % i == 0) {
                perimeter = i * 2 + N / i * 2;
                break;
            }
        }

        return perimeter;
    }
}
