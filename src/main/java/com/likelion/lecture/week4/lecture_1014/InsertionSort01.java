package com.likelion.lecture.week4.lecture_1014;

import java.util.Arrays;

public class InsertionSort01 {
    //재귀로 풀어보자!
    public void swap(int[] arr, int i, int j){
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void insertionSort(int[] arr, int j){
        int tmp;
        for(int i = j;i<arr.length;i++){
            if(i == arr.length){
                break;
            }
            if(arr[i] < arr[i-1]){
                swap(arr, arr[i], arr[i-1]);
            }
            insertionSort(arr, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{8,5,6,2,4};
        InsertionSort01 is = new InsertionSort01();

        is.insertionSort(arr,1);

        System.out.println(Arrays.toString(arr));
    }
}
