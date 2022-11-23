package com.likelion.lecture.week10.lecture_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1부터 n꺼지 합 구하기
 */
public class CodeUp1901 {
    public static int sumOfNum(int num){
        //num이 1보다 작은 경우 1 return
        if (num <= 1) return 1;
        return sumOfNum(num-1) + num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(sumOfNum(num));
    }
}
