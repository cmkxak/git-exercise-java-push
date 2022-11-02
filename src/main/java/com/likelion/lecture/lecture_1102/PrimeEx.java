package com.likelion.lecture.lecture_1102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeEx {
    private final int N = 50;
    List<Integer> nums;

    public PrimeEx() {
        this.nums = new ArrayList<>(N);
    }

    public void setNums(){
        for(int i = 2; i< N; i++){
            nums.add(i);
        }
    }

    public void getNums(){
        nums.forEach((item) -> {
            System.out.println(item);
        });
    }

    public boolean isPrime(int num){
        for(int i = 2; i * i < num; i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int num){
        setNums();
        for(int i = 2; i*i <= N; i++){
            for (int j=0;j<nums.size();j++){
                if(nums.get(j) % i == 0 && nums.get(j) > i)
                    nums.remove(j);
            }
        }
        getNums();
        return nums.size();
    }

    public static void main(String[] args) {
        PrimeEx prime = new PrimeEx();
        prime.solution(1000000);
    }



}
