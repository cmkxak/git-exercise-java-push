package com.likelion.lecture.week3.lecture_1005.numbergenerator;

public class Main {
    public static void main(String[] args){
        NumberGenerator specificNumberGenerator = new SpecificNumberGenerator();
        Calculator specificNumbercalculator = new Calculator(specificNumberGenerator);
        specificNumbercalculator.plus();

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Calculator randomNumberCalculator = new Calculator(randomNumberGenerator);
        randomNumberCalculator.plus();
        
        NumberGenerator specificNumberGenerator1 = new SpecificNumberGenerator();
        Calculator calculator = new Calculator(10, specificNumberGenerator1);
        calculator.plus();
    }
}
