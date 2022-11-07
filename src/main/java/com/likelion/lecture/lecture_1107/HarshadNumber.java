package com.likelion.lecture.lecture_1107;

public class HarshadNumber {
    public boolean solution(int x) {
        int sum = 0;

        //1. 자릿수의 합 구하기
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        //2. 나누어 떨어지는지 check 하기
        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}
