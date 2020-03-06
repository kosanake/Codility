package org.codility.lessons.lesson2;

public class OddOccurrencesInArray {

    public int solution(int[] A){

        if (A.length == 0)
            return 0;

        int result = 0;
        for (int i = 0; i < A.length; i++)
            result ^= A[i];

        return result;
    }
}
