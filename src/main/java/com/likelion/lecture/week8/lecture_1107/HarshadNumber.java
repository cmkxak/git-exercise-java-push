package com.likelion.lecture.week8.lecture_1107;

public class HarshadNumber {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;

        //1. 자릿수의 합 구하기
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        //2. 나누어 떨어지는지 check 하기
        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}
