package com.likelion.lecture.lecture_1111;

import java.util.Stack;

public class BinaryTo {
    public void toBinary(int n){
        Stack<Integer> stack = new Stack();
        while (n > 0){
            stack.add(n % 2);
            n/=2;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTo binaryTo = new BinaryTo();
        binaryTo.toBinary(18);
    }
}
