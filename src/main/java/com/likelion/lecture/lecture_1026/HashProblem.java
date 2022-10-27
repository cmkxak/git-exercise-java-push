package com.likelion.lecture.lecture_1026;
import java.util.*;

public class HashProblem {
    public String solution(String[] participant, String[] completion) {
            String result = "";
            HashMap<String, Integer> answer = new HashMap<>();
            for(String p : participant){
                answer.put(p, answer.getOrDefault(p,0) + 1);
            }
            for(String c : completion){
                answer.put(c, answer.get(c) - 1 );
            }
            for (String key : answer.keySet()){
                if (answer.get(key) != 0){
                    result = key;
                }
            }
            return result;
        }
}
