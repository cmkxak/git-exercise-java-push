package com.likelion.lecture.lecture_1102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeEx {
    private final int N = 50;

    List<Integer> nums = new ArrayList<>();

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

    public void eratosthenes(){
        for(int i = 2 ; i< 10; i++){
            if (isPrime(i)){
                for(int j=i;j< N;j*=i){
                    nums.remove(j);
                }
            }
        }
    }


    public static void main(String[] args) {
        PrimeEx prime = new PrimeEx();
        prime.eratosthenes();

    }



}
