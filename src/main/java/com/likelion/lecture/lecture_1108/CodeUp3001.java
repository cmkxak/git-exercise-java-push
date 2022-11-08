package com.likelion.lecture.lecture_1108;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp3001 {

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); //전체 수 입력
        }

        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (nums[i] == k) {
                result = i + 1;
                break;
            }else{
                result = -1;
            }
        }
        System.out.println(result);
    }
}
