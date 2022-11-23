package com.likelion.lecture.week10.lecture_1123;

public class CodeUp1851 {
    public void recursivePrint(int n){
        if (n <= 0) return;
        recursivePrint(n - 1);
        System.out.print("*");
    }

    public static void main(String[] args) {
        CodeUp1851 c = new CodeUp1851();
        c.recursivePrint(5);
    }
}
