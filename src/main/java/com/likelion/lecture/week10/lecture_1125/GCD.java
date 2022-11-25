package com.likelion.lecture.week10.lecture_1125;

public class GCD {
    public int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        } else if (a < b) {
            return gcd(a, b - a);
        }
        return 1;
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int result = gcd.gcd(196, 42);
        System.out.println(result);
    }
}
