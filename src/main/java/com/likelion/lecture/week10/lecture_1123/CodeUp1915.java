package com.likelion.lecture.week10.lecture_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1915 {
    public static int fibonacci(int n) {
        if (n<=2) return 1;
        return fibonacci(n - 1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }
}
