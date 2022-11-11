package com.likelion.lecture.lecture_1111;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String binaryString = "";

        //1. 지도1과 지도2의 or 연산 결과를 2진수로 변환
        for (int i = 0; i < n; i++) {
            binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = binaryString;
        }

        //2.변환한 문자열을 #과 공백으로 대체
        for (int i = 0; i < n; i++) {
            answer[i].replace('0', " ");
            answer[i].replace('1', "#");
        }

        return answer;
    }
}
