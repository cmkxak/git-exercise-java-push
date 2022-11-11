package com.likelion.lecture.week8.lecture_1109;

import java.util.Arrays;

interface StatementStrategy{
    boolean apply(int a, int b);
}

public class SelectionSort {
    public int[] selectionSort(int arr[], StatementStrategy stmt){
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i+1; j<arr.length;j++){
                if (stmt.apply(arr[minIdx], arr[j])) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort sc = new SelectionSort();
        sc.selectionSort(arr, (a, b) -> a < b); //내림차순
        sc.selectionSort(arr, (a, b) -> a > b); //오름차순
    }
}
