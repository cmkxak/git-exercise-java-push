package com.likelion.lecture.week12.lecture_1209;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; //열
        String str2 = "DCABDC"; // 행

        int dp[][] = new int[str2.length()+ 1][str1.length() + 1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j=1; j<= str1.length(); j++){
                System.out.printf("i:%s j:%s\n", str2.charAt(i-1), str1.charAt(j-1));
                //두개가 같으면 대각에서 가지고 옵니다.
                //대각선 dp[i-1][j-1]
                if (str2.charAt(i-1) == str1.charAt(j-1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
    }
}
