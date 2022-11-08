package com.likelion.lecture.lecture_1108;

public class BinarySearch {

    public int binarySearch(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2; //중간 값 지정

            //중간 값을 기준으로 시작점, 끝점 변경
            if (key > nums[mid]){
                start = mid+1;
            }else if(key < nums[mid]){
                end = mid-1;
            }else{
                return nums[mid];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(bs.binarySearch(nums, 7));
    }
}
