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
        
    }
}
