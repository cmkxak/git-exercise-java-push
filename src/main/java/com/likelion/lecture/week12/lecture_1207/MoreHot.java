package com.likelion.lecture.week12.lecture_1207;

import java.util.*;

public class MoreHot {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>();

        for (int s : scoville) {
            pq.add(s);
        }

        while (pq.peek() <= K) {
            if (pq.size() == 1) {
                return -1;
            }
            pq.add(pq.poll() + pq.poll() * 2);
            answer += 1;
        }
        return answer;
    }
}
