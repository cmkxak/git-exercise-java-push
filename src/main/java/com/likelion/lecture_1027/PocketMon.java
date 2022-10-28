package com.likelion.lecture_1027;

import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스 : 폰켓몬
 */
public class PocketMon {
    public int solution(int[] nums) {
        int max = nums.length / 2; //반절만 뽑을 수 있으므로
        int answer = 0;

        Set<Integer> pocketMon = new HashSet<>();
        for(int n : nums){
            pocketMon.add(n); //중복 제거
        }

        answer =  (pocketMon.size() > max) ? max : pocketMon.size(); //중복 제거 한 포켓몬 값 중, max 값보다 더 큰 경우와 작은 경우로 나눔

        return answer;
    }
}
