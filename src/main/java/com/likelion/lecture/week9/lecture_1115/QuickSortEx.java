package com.likelion.lecture.week9.lecture_1115;

import java.util.ArrayList;
import java.util.List;

public class QuickSortEx {
    public static void quickSort() {
        Integer arr[] = new Integer[]{20,18,5,19,5,25,40,50};

        //1. 기준값 뽑기
        int pivot = ( arr.length ) / 2;

        //2. 기준값 기준으로 왼쪾 오른쪽 나누어 담는 로직 구현
        List<Integer> lessThan = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> moreThan = new ArrayList<>();

        for (Integer a : arr) {
            if (a< pivot) lessThan.add(a);
            else if (a > pivot) {
                moreThan.add(a);
            }else{
                equal.add(a);
            }
        }
        //3. pivot을 기준으로 나누어진 부분 다시 정렬
    }

    public static void main(String[] args) {

    }
}
