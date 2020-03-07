package org.codility.lessons.lesson7;

import java.util.ArrayDeque;
import java.util.Deque;

public class Fish {
    public int solution(int[] A, int[] B) {

        if (A.length == 0)
            return 0;

        int numAlive = A.length;
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < A.length; i++) {

            if (B[i] == 1)
                st.push(A[i]);

            if (B[i] == 0) {
                while (!st.isEmpty()) {
                    if (st.peek() > A[i]) {
                        numAlive--;
                        break;
                    } else if (st.peek() < A[i]) {
                        numAlive--;
                        st.pop();
                    }
                }
            }
        }

        return numAlive;
    }
}