package com.likelion.lecture.lecture_1108;

import java.util.Scanner;

public class CodeUp2083 {
    public static void binarySearch(int[]nums, int key){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if (nums[mid] == key) {
                System.out.println(mid + 1);
                System.exit(0);
            }else if(nums[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int key = sc.nextInt();

        int []nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        binarySearch(nums, key);
    }
}
