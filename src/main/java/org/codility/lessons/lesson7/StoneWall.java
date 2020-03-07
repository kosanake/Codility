package org.codility.lessons.lesson7;

import java.util.ArrayDeque;
import java.util.Deque;

public class StoneWall {
    public int solution(int[] H) {

        Deque<Integer> blocks = new ArrayDeque<>();
        int num =0;

        for(int i=0; i< H.length; i++){
            while( blocks.isEmpty()==false && blocks.peek() > H[i] )
                blocks.pop();

            if( blocks.isEmpty() ){
                blocks.push(H[i]);
                num++;
            } else if( blocks.peek() < H[i] ){
                blocks.push(H[i]);
                num++;
            }
        }

        return num;
    }
}
