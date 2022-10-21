package com.likelion.hw.hw_1007;

import java.util.Scanner;

public class Problem_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int hex = Integer.parseInt(str, 16);
        System.out.printf("%o", hex);
    }
}
