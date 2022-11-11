package com.likelion.lecture.week4.lecture_1011;

public class SumOfDigit {
    //1. 문자열로 loop 돌면서 Integer로 변환해주기
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);

        for(int i=0;i<s.length();i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        System.out.println(answer);
        return answer;
    }

    //2. 몫과 나머지 이용하기
    public int solution2(int n){
        int answer = 0;

        while(n > 0){
            answer += n%10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfDigit s = new SumOfDigit();
        s.solution(123);
        s.solution2(123);
    }
}