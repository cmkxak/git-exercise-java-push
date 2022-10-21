package com.likelion.lecture.lecture_1018;

import java.util.Scanner;

public class SquareStar {
    public void printSquare(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }

    public void printRectangluar(int x, int y){
        for(int i=0;i<x;i++){
            System.out.println("*".repeat(y));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SquareStar square = new SquareStar();
        int x = sc.nextInt();
        int y = sc.nextInt();
        square.printRectangluar(x,y);
    }
}
