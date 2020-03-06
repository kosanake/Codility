package org.codility.lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public int solution(int[] A) {

        Set<Integer> numbers = new HashSet<>();
        for (int i : A)
            numbers.add(i);

        for (int i = 1; i <= A.length; i++) {
            if (!numbers.contains(i))
                return 0;
        }

        return 1;
    }
}
