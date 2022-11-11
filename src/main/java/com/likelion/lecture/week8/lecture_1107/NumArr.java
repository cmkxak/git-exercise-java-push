package com.likelion.lecture.week8.lecture_1107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumArr {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();

        for(int ele : arr){
            if(ele % divisor == 0){
                result.add(ele);
            }
        }
        if (result.size() == 0){
            result.add(-1);
        }else{
            Collections.sort(result);
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
