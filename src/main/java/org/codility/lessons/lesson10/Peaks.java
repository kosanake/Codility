package org.codility.lessons.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Peaks {
    public int solution(int[] A) {

        List<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1])
                peaks.add(i);
        }

        int N = A.length;
        for (int blocks = N; blocks >= 1; blocks--) {
            if (N % blocks == 0) {
                int blockSize = N / blocks;
                int block = 0;

                for (int peak : peaks) {
                    if (peak / blockSize == block)
                        block++;
                }

                if (block == blocks)
                    return blocks;
            }
        }

        return 0;
    }
}
