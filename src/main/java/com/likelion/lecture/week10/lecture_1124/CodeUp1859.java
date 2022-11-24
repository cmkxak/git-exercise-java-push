package com.likelion.lecture.week10.lecture_1124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1859 {
    public void recursivePrintStar(int n) {
        if (n < 1) return;
        recursivePrintStar(n - 1);
        printStar(n);
        System.out.println();
    }

    private void printStar(int n) {
        if (n < 1) return;
        printStar(n - 1);
        System.out.print("*");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CodeUp1859 c = new CodeUp1859();
        c.recursivePrintStar(n);
    }
}
