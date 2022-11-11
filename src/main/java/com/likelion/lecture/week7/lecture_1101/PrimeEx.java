package com.likelion.lecture.week7.lecture_1101;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class PrimeEx {
    public boolean isPrime(int num, StatementStrategy stmt){
        for(int i=2; stmt.compare(i, num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeEx prime = new PrimeEx();
        int arr[] = {13, 17, 19, 8};
        for (int i : arr) {
            boolean isPrime = prime.isPrime(i, (a,b)-> a<b);
            boolean isPrime2 = prime.isPrime(i, (a,b)-> a<b/2);
            boolean isPrime3 = prime.isPrime(i, (a,b)-> a*a<b);
            System.out.println(i+ "의 소수 여부 : " + isPrime3);
        }
    }
}
