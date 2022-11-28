package com.likelion.lecture.week11;

public class AlphabetCombination {
    public static void main(String[] args) {
        for(char i = 'A'; i<='Z'; i++){
            System.out.println(i);
        }

        for(char i = 'A'; i<='Z'; i++){
            for(char j = 'A'; j<='Z';j++)
                System.out.printf("%s%s\n", i,j);
        }
    }
}
