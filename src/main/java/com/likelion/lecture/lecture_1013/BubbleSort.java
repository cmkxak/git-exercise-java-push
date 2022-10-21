package com.likelion.lecture.lecture_1013;

import java.util.Arrays;

public class BubbleSort {
    private int[] bubbleSort(int[] arr){
        int tmp;

        for(int i =0;i<arr.length;i++){
            for(int j = 0 ; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{7,2,3,9,28,121,4,124,14,45,311,122,533,23,144,225,234,21,12,3,21,50,56};
        BubbleSort bs = new BubbleSort();

        bs.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
