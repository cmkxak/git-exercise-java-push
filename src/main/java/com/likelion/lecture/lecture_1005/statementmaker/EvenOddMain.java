package com.likelion.lecture.lecture_1005.statementmaker;

public class EvenOddMain {
    public static void main(String[] args) {
        //변화가 많은 곳은, 인터페이스에 의존하도록 설게해주어야 한다.
        WordMaker koreanWordMaker = new KoreanWordMaker();
        EvenOdd korEvenOdd = new EvenOdd(koreanWordMaker);
        korEvenOdd.getEvenOdd(10);

        WordMaker englishWordMaker = new EnglishWordMaker();
        EvenOdd engEvenOdd = new EvenOdd(englishWordMaker);
        engEvenOdd.getEvenOdd(10);
    }
}
