package com.likelion.lecture.week7.lecture_1103;

import java.util.Arrays;

public class Erathostenes {
    public int solution(int n) {
        int count = 0;
        boolean arr[] = new boolean[n + 1];

        Arrays.fill(arr, true); //일단 모든 수를 소수라고 가정 (0,1은 제외)

        for (int i = 2; i <= Math.sqrt(n); i++) { //제곱근까지만 비교 대상
            if (arr[i]) { //남은 수가 소수라면
                int j = 2;
                while (i * j <= n) { //남은 수의 배수들을 false로 초기화
                    arr[i * j] = false;
                    j += 1; //j를 1씩 증가시키면서 배수들에 접근
                }
            }
        }
        //소수 결과 출력
        for (int i = 2; i < n; i++) {
            if(arr[i]) count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Erathostenes erathostenes = new Erathostenes();
        erathostenes.solution(100);
    }
}
