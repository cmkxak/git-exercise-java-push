package com.likelion.lecture.lecture_1109;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i+1; j<arr.length;j++){
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
