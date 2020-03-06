package org.codility.lessons.lesson5;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenomicRangeQuerySparseTableTest {

    @Test
    public void shoudSolution() {
        GenomicRangeQuerySparseTable genomicRangeQuerySparseTable = new GenomicRangeQuerySparseTable();
        assertArrayEquals(new int[]{2, 4, 1}, genomicRangeQuerySparseTable.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
//        assertArrayEquals(new int[]{2, 2, 2}, genomicRangeQuery.solution("CCCCCCC", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
//        assertArrayEquals(new int[]{1, 1, 1}, genomicRangeQuery.solution("AAAAAAA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
//        assertArrayEquals(new int[]{4, 4, 4}, genomicRangeQuery.solution("TTTTTTT", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
    }
}