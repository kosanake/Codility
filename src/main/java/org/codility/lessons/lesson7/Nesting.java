package org.codility.lessons.lesson7;

import java.util.*;

public class Nesting {
    public int solution(String S) {

        Deque<Character> deque = new ArrayDeque<>(S.length());
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (c.equals('(')) {
                deque.push(c);
            } else {
                if (deque.isEmpty())
                    return 0;
                if (!deque.pop().equals('('))
                    return 0;
            }

        }
        if (deque.isEmpty())
            return 1;
        else
            return 0;
    }
}
