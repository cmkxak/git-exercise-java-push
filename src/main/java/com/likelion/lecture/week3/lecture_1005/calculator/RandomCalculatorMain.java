package com.likelion.lecture.week3.lecture_1005.calculator;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        RandomNumberImpl randomNumberImpl = new RandomNumberImpl();
        RandomCalculator randomCalculator = new RandomCalculator(10, randomNumberImpl);

        System.out.println(randomCalculator.plus());
        System.out.println(randomCalculator.minus());
        System.out.println(randomCalculator.multiple());
        System.out.println(randomCalculator.divide());

        //로직이 변경이 될 수도 있기 때문에, 구현하고 싶지 않아요.
        //Calculator 클래스를 설명하시던 중.
    }
}
