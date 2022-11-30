package com.likelion.lecture.week11.lecture_1130;

public class NumOfPandY {
    boolean solution(String s) {

        int pCount = 0, yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'p': case 'P':
                    pCount++;
                    break;

                case 'y': case 'Y':
                    yCount++;
                    break;
            }
        }
        return pCount == yCount;
    }

    //lambda를 활용한 풀이
    boolean solution2(String s){
        s = s.toUpperCase();
        return s.chars().filter(c -> c == 'P').count() == s.chars().filter(c -> c == 'Y').count();
    }

    public static void main(String[] args) {
        NumOfPandY numOfPandY = new NumOfPandY();
        String s = "pPoooyY";
        System.out.println(numOfPandY.solution2(s));
    }
}
