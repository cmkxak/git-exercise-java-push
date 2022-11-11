package com.likelion.lecture.week3.lecture_1005.numbergenerator;

public class Calculator {
    private int baseNum;
    private NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.baseNum = 10;
        this.numberGenerator = numberGenerator;
    }

    public Calculator(int baseNum, NumberGenerator numberGenerator){
        this.baseNum = baseNum;
        this.numberGenerator = numberGenerator;
    }

    public void plus(){
        System.out.println(10 + numberGenerator.generate(baseNum));
    }
}
