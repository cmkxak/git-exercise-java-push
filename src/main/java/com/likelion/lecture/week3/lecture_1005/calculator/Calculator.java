package com.likelion.lecture.week3.lecture_1005.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int plus(){
        return a+b;
    }

    public int minus(){
        return a-b;
    }

    public int multiple(){
        return a*b;
    }

    public float divide(){
        return (float) a/b;
    }
}
