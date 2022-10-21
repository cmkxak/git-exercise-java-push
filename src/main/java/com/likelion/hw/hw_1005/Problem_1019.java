package com.likelion.hw.hw_1005;

import java.util.Scanner;

public class Problem_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String []s = str.split("\\.");

        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
