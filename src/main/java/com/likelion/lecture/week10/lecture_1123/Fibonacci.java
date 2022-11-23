package com.likelion.lecture.week10.lecture_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static int fibonacci(int[] arr, int n){

        arr[1] = 1;
        arr[2] = 1;

        for(int i=3;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n+1];
        System.out.println(fibonacci(arr, n));
    }
}
