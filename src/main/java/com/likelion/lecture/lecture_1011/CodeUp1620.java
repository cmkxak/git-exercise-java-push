package com.likelion.lecture.lecture_1011;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        CodeUp1620 c = new CodeUp1620();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c.solution(n);
    }

    public void solution(int n){
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n = n / 10;
        }
            if (result < 10){
                System.out.println(result);
            }else{
                solution(result);
            }
        }
}
