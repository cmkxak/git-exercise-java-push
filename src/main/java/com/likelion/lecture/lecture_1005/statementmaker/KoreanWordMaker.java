package com.likelion.lecture.lecture_1005.statementmaker;

public class KoreanWordMaker implements WordMaker {
    @Override
    public String getWordMaker(int num) {
        if (num % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }
}
