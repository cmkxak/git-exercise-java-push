package com.likelion.lecture.week7.lecture_1102;

import java.util.Arrays;

public class PrimeEx {

    public int solution(int n) {
        int answer = 0;
        boolean arr[] = new boolean[n + 1];

        Arrays.fill(arr, true);

        for(int i=2;i<=Math.sqrt(n); i++){ //2부터 n의 제곱근 까지 모든 수를 확인
            if(arr[i]){ //i가 소수인 경우 (남은 수인 경우)
                int j=2;
                //i를 제외한 모든 i의 배수 지우기
                while (i*j <=n){
                    arr[i * j] = false;
                    j+=1;
                }
            }
        }
        for(int i= 2;i<=n;i++){
            if(arr[i]) answer+=1;
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeEx prime = new PrimeEx();
        prime.solution(50);
    }
}
