package com.likelion.lecture.lecture_1101;

public class PrimeEx {
    public boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeEx prime = new PrimeEx();
        int arr[] = {13, 17, 19, 8};
        for (int n : arr) {
            if(prime.isPrime(n))
                System.out.println(n + "은 소수 입니다.");
        }
    }
}
