package org.codility.lessons.lesson7;

import java.util.*;

public class Brackets {
    public int solution(String S) {

        Set<Character> braces = new HashSet<>();
        braces.add('(');
        braces.add('{');
        braces.add('[');
        Map<Character, Character> revertBraces = new HashMap<>();
        revertBraces.put(')', '(');
        revertBraces.put('}', '{');
        revertBraces.put(']', '[');

        Deque<Character> deque = new ArrayDeque<>(S.length());
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (braces.contains(c)) {
                deque.push(c);
            } else {
                if (deque.isEmpty())
                    return 0;
                if (!revertBraces.get(c).equals(deque.pop()))
                    return 0;
            }

        }
        if (deque.isEmpty())
            return 1;
        else
            return 0;
    }
}
