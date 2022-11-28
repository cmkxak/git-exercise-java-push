package com.likelion.lecture.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCombination {
    private void printAlphabet(int size, char c) {
        //종료 조건
        if (size <= 0) return;

        System.out.println(c);

        if (c >= 'Z')
            c = 'A';
        else
            c = (char) (c + 1);
        size -= 1;

        printAlphabet(size, c);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AlphabetCombination ac = new AlphabetCombination();

        int size = Integer.parseInt(br.readLine());
        char c = 'A';

        ac.printAlphabet(size,c);
    }
}
