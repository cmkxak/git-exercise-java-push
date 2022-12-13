package com.likelion.lecture.week13;

class Pair {
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + "," + right + ")";
    }
}

public class OptimalStrategy {
    public static void main(String[] args) {
        int coins[] = {2, 7, 19, 40};
        Pair[][] dp = new Pair[4][4];

        for (int i = 0; i < coins.length; i++) {
            dp[i][i] = new Pair(coins[i], 0); //한가지만 선택하는 경우
        }

        for (int i = 0; i < coins.length; i++) {
            System.out.println(dp[i][i]);
        }
    }
}
