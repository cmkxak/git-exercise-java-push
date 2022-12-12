package com.likelion.lecture.week13;

import java.util.Arrays;

public class MCP {
    public void getMinCost(int matrix[][]){
        int dp[][] = new int[matrix.length][matrix[0].length];

        for (int i =0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (i == 0 && j == 0){
                    dp[i][j] = matrix[i][j];
                }else if (i>0 && j>0){
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i-1][j-1]) + matrix[i][j];
                }else if (i == 0 && j > 0) {
                    dp[i][j] = dp[i][j - 1] + matrix[i][j];
                }else if (i > 0 && j == 0){
                    dp[i][j] = dp[i-1][j] + matrix[i][j];
                }
            }
        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void main(String[] args) {
        MCP mcp = new MCP();

        int matrix[][] = new int[][]{
                {1,3,2},{4,6,2},{1,2,4}
        };

        mcp.getMinCost(matrix);
    }
}
