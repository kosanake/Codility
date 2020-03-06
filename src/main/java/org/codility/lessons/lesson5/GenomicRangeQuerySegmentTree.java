package org.codility.lessons.lesson5;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuerySegmentTree {

    private int[] tree;
    private int[] arr;

    public int[] solution(String S, int[] P, int[] Q) {

        Map<Character, Integer> weights = new HashMap<>();
        weights.put('A', 1);
        weights.put('C', 2);
        weights.put('G', 3);
        weights.put('T', 4);

        tree = new int[4 * S.length()];
        arr = new int[S.length()];
        for (int i = 0; i < S.length(); i++)
            arr[i] = weights.get(S.charAt(i));

        build(0, 0, arr.length - 1);

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            result[i] = query(0, 0, arr.length - 1, P[i], Q[i]);
        }


        return result;
    }

    private int query(int v, int vl, int vr, int l, int r) {
        if (r < vl || l > vr)
            return Integer.MAX_VALUE;
        else if (vl >= l && vr <= r)
            return tree[v];

        int vm = vl + (vr - vl) / 2;
        int ql = query(2 * v + 1, vl, vm, l, r);
        int qr = query(2 * v + 2, vm + 1, vr, l, r);
        return Math.min(ql, qr);
    }

    private void build(int v, int vl, int vr) {
        if (vl == vr) {
            tree[v] = arr[vl];
            return;
        }
        int vm = vl + (vr - vl) / 2;
        build(2 * v + 1, vl, vm);
        build(2 * v + 2, vm + 1, vr);
        tree[v] = Math.min(tree[2 * v + 1], tree[2 * v + 2]);
    }

}