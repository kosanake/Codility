package org.codility.lessons;

/**
 * Lesson 1
 */
public class BinaryGap {

    public int solve(int number) {

        int index = 0;
        int max = 0;
        boolean start = false;

        while (number != 0) {

            if ((number & 1) == 1)
                start = true;

            if (start) {
                if ((number & 1) == 0) {
                    index++;
                } else {
                    max = Math.max(max, index);
                    index = 0;
                }
            }

            number >>= 1;
        }

        return max;
    }
}