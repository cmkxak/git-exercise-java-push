package com.likelion.lecture.week5.lecture_1017;

public class Pyramid {
    public void printPyramid(int n){
        for(int i =0; i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0; k<i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid p = new Pyramid();
        p.printPyramid(5);
    }
}
