package org.codility.lessons.lesson5;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuerySparseTable {

    public int[] solution(String S, int[] P, int[] Q) {

        Map<Character, Integer> weights = new HashMap<>();
        weights.put('A', 1);
        weights.put('C', 2);
        weights.put('G', 3);
        weights.put('T', 4);

        int[] arr = new int[S.length()];
        for (int i = 0; i < S.length(); i++)
            arr[i] = weights.get(S.charAt(i));

        int[][] sparseTable = buildSparseTable(arr);
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++)
            result[i] = minQuery(sparseTable, P[i], Q[i]);

        return result;
    }

    int minQuery(int[][] sparseTable, int start, int end){
        int j = (int)Math.log(end - start + 1);

        if (sparseTable[start][j] <= sparseTable[end - (1 << j) + 1][j])
            return sparseTable[start][j];
        else
            return sparseTable[end - (1 << j) + 1][j];
    }

    private int[][] buildSparseTable(int[] arr) {
        int[][] sparseTable = new int[arr.length][(int) (Math.log(arr.length) / Math.log(2)) + 1];

        for (int i = 0; i < arr.length; i++)
            sparseTable[i][0] = arr[i];

        for (int j = 1; 1 << j < arr.length ; j++){
            for (int i = 0; i + (1 << j) - 1 < arr.length; i++){
                if (sparseTable[i][j - 1] < sparseTable[i + (1 << (j - 1))][j - 1])
                    sparseTable[i][j] = sparseTable[i][j - 1];
                else
                    sparseTable[i][j] = sparseTable[i + (1 << (j - 1))][j - 1];
            }
        }

        return sparseTable;
    }

}