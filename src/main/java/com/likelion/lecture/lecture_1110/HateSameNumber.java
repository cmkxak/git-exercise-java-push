package com.likelion.lecture.lecture_1110;

import java.util.*;

public class HateSameNumber {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                list.add(arr[i]);
            }

            if (list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
