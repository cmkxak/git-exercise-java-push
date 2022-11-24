package com.likelion.lecture.week10.lecture_1124;

public class CodeUp1860 {
    public void recursivePrintNum(int n){
        if (n <= 0) return;
        recursivePrintNum(n-1);
        printNum(n);
        System.out.println();
    }

    private void printNum(int n) {
        if (n <= 0) return;
        printNum(n-1);
        System.out.print(n + " ");
    }


    public static void main(String[] args) {
        CodeUp1860 c = new CodeUp1860();
        c.recursivePrintNum(5);
    }
}
