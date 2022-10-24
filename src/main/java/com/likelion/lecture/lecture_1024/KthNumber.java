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
     public int getKthNum(int[] array, int[]commands){
         int fromIdx = commands[0]-1;
         int toIdx = commands[1];
         int kthIdx = commands[2]-1;
         int result = 0;

         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for (int i = fromIdx; i < toIdx; i++) {
             pq.add(array[i]);
         }

         for(int i=0;i<=kthIdx;i++){
            result = pq.poll();
         }
         return result;
     }

    public int[] solutionByPriorityQueue(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(arr, commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        KthNumber kthNum = new KthNumber();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        kthNum.solutionByPriorityQueue(arr, commands);
    }
}
