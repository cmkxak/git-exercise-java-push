package com.likelion.lecture.lecture_1024;

import java.util.*;

public class KthNumber {
     public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int idx = 0;
            for(int[] command : commands){
                int[] slicedArr = Arrays.copyOfRange(array, command[0]-1, command[1]);
                Arrays.sort(slicedArr);
                answer[idx++] = slicedArr[command[2] - 1];
            }
            return answer;
        }
}
