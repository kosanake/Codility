package org.codility.lessons.lesson5;

public class MinAvgTwoSlice {

    public int solution(int[] A) {

        int sumTwo = 0;
        int sumThree = 0;

        int indexTwo = 0;
        int indexThree = 0;

        int minTwo = Integer.MAX_VALUE;
        int minThree = Integer.MAX_VALUE;

        int[] windowTwo = new int[2];
        int[] windowThree = new int[3];

        for (int i = 0; i < windowTwo.length; i++) {
            windowTwo[i] = A[i];
            sumTwo += A[i];
            minTwo = sumTwo;
        }

        for (int i = windowTwo.length; i < A.length; i++) {
            sumTwo = sumTwo + A[i] - A[i - windowTwo.length];
            if (minTwo > sumTwo) {
                minTwo = sumTwo;
                indexTwo = i - windowTwo.length + 1;
            }
        }

        if (A.length > 2) {
            for (int i = 0; i < windowThree.length; i++) {
                windowThree[i] = A[i];
                sumThree += A[i];
                minThree = sumThree;
            }

            for (int i = windowThree.length; i < A.length; i++) {
                sumThree = sumThree + A[i] - A[i - windowThree.length];
                if (minThree > sumThree) {
                    minThree = sumThree;
                    indexThree = i - windowThree.length + 1;
                }
            }
        }

        if (minTwo / 2.0 > minThree / 3.0) {
            return indexThree;
        } else {
            return indexTwo;
        }
    }
}
