package com.likelion.lecture.lecture_1005.calculator;

public class RandomNumberImpl implements RandomNumber{
    private int randomNumber;

    @Override
    public int getRandomNumber() {
        return (int) ((Math.random() * (10 - 0)));
    }
}
