package com.likelion.lecture.week8.lecture_1111;

import java.util.Arrays;
import java.util.Stack;

public class BinaryTest {
    public String toBinary(int n){
        Stack<Integer> stack = new Stack();
        String answer= "";
        while (n > 0){
            stack.add(n % 2);
            n/=2;
        }
        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        return answer;
    }

    //개수에 맞는 2진수 구하기
    public String solution(int n, int[] arr1, int[] arr2) {
        String answer = "";
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];

        for (int i = 0; i < n; i++) {
            // arr1
            for (int j = 0; j < n; j++) {
                String binStr1 = toBinary(arr1[i]);
                String binStr2 = toBinary(arr2[i]);
                sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;
                sArr2[i] = "0".repeat(n - binStr2.length()) + binStr2;
            }
        }

        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));

        return answer;
    }

    public static void main(String[] args) {
        BinaryTest binary = new BinaryTest();
        binary.toBinary(18);
        binary.solution(5, new int[]{9,20,28,18,11}, new int[]{30,1,21,17,28});
    }
}
