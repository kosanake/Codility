package org.codility.lessons.lesson3;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int delta = Y - X;
        int fullJumps = delta / D;
        int reminder = delta % D == 0 ? 0 : 1;
        return fullJumps + reminder;
    }

}
