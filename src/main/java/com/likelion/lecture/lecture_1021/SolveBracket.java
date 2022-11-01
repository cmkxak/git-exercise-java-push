package com.likelion.lecture.lecture_1021;

import java.util.Stack;

public class SolveBracket {
    public boolean solution(String s){
        while(s.indexOf("()") >= 0){
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

    public boolean solutionByStack(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (ch == '(') {
                stack.push(ch);
            }else{
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        SolveBracket solveBracket = new SolveBracket();
        if(solveBracket.solutionByStack("()()()()")){
            System.out.println("올바른 스택.");
        }else{
            System.out.println("짝이 안맞은 스택입니다.");
        }

    }
}
