package com.likelion.lecture.week10.lecture_1125;

public class GCDbyLoop {
    public int gcd(int a, int b){
        int n;
        while (b != 0){
            n = a%b;
            a = b;
            b = n;
        }
        return a;
    }

    public static void main(String[] args) {
        GCDbyLoop gcdByLoop = new GCDbyLoop();
        int result = gcdByLoop.gcd(196, 42);
        System.out.println(result);

    }
}
