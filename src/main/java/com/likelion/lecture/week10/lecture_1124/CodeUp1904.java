package com.likelion.lecture.week10.lecture_1124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1904 {
    public void getOddNumByRecursive(int a, int b){
        //종료조건
        if (b < a) return;

        getOddNumByRecursive(a, b - 1);

        if (b % 2 != 0)
            System.out.print(b + " ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = br.readLine();
        String[] nums = inputNum.split(" ");

        int min = Integer.parseInt(nums[0]);
        int max = Integer.parseInt(nums[1]);

        CodeUp1904 c = new CodeUp1904();
        c.getOddNumByRecursive(min, max);
    }
}
