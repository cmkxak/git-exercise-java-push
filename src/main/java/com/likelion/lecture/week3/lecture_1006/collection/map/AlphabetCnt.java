package com.likelion.lecture.week3.lecture_1006.collection.map;

import java.util.HashMap;

public class AlphabetCnt {
    public boolean isAlphabet(char c){
        return c >= 'A' && c <= 'Z';
    }

    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();
        HashMap<Character, Integer> map = new HashMap<>();

        //map에 a-z까지 등록
        for(char c = 'A'; c<='Z'; c++){
            map.put(c, 0);
        }

        //소문자는 --> 대문자로
        String s = "https://github.com/cmkxak/likelion-java-course/blob/Main/src/lecutre_1006/collection/map/MapExercise.java".toUpperCase();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if(isAlphabet)
                map.put(c, map.get(c) + 1);
        }
        System.out.println(map);
    }
}
