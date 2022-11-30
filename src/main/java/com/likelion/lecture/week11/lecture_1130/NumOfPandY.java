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

    public static void main(String[] args) {
        NumOfPandY numOfPandY = new NumOfPandY();
        String s = "pPoooyY";
        System.out.println(numOfPandY.solution(s));
    }
}
