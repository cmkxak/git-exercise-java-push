package com.likelion.lecture.week9.lecture_1116;

import java.util.Arrays;

public class QuickSortPrac {
    public String partition(int arr[]) {
        //1. 피봇, 시작, 끝점 선정
        int left = 0;
        int right = arr.length - 1;
        int pivot = arr[(left + right) / 2];

        //2. 피봇을 기준으로 왼쪽 : 작은 값 , 오른쪾 : 큰 값 while(왼쪽 < 오른쪽)
        while (left <= right) {
            while (arr[left] < pivot) //피봇보다 크면
                left++;
            while (arr[right] > pivot) //피봇보다 작으면
                right--;

            //left <= right 이면 교환
            //교환 후, left++, right--
            if (left <= right) { //피봇보다 큰 수 in left < 피봇보다 작은 수 in right
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return Arrays.toString(arr);
    }

    private static void swap (int[] arr, int start, int end){
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        QuickSortPrac qs = new QuickSortPrac();
        System.out.println(qs.partition(arr));
    }
}
