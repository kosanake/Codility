package org.codility.lessons.lesson1;

/**
 * Lesson 1
 */
public class BinaryGap {

    public int solution(int N) {

        int index = 0;
        int max = 0;
        boolean start = false;

        while (N != 0) {

            if ((N & 1) == 1)
                start = true;

            if (start) {
                if ((N & 1) == 0) {
                    index++;
                } else {
                    max = Math.max(max, index);
                    index = 0;
                }
            }

            N >>= 1;
        }

        return max;
    }
}