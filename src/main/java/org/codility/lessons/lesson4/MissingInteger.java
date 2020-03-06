package org.codility.lessons.lesson4;

public class MissingInteger {

    public int solution(int[] A) {

        boolean[] counter = new boolean[10000001];
        for (int i : A) {
            if (i > 0)
                counter[i] = true;
        }

        for (int i = 1; i < counter.length; i++) {
            if (!counter[i])
                return i;
        }

        return 1;
    }
}
