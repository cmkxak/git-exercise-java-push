package com.likelion.hw.hw_1006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] numbers = str.split("");

        int num =10000;

        for (String number : numbers) {
            System.out.println("[" + Integer.parseInt(number) * num + "]");
            num/=10;
        }
    }
}
