package com.likelion.lecture.week5.lecture_1024;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        pq.forEach(item -> System.out.print(item + " "));
    }
}
