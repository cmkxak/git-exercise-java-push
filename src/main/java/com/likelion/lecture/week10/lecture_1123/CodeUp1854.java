package com.likelion.lecture.week10.lecture_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 재귀로 각 자리 수의 합 리턴하기
 */
public class CodeUp1854 {
    public static long sumOfNum(long n){
        if (n == 0) return 0;
        return sumOfNum(n / 10) + (n % 10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        System.out.println(sumOfNum(num));
    }
}
