package com.likelion.hw.hw_1011;

import java.util.Scanner;

public class Problem_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(a + b + c);
        System.out.println(String.format("%.1f", (float)(a + b + c) / 3)) ;
    }
}
