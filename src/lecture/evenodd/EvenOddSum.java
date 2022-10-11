package lecture.evenodd;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String aResult = (a%2 ==0) ? "짝수+" : "홀수+";
        String bResult = (b%2 ==0) ? "짝수=" : "홀수=";
        String sumResult = ((a+b) %2 ==0) ? "짝수" : "홀수";

        System.out.println(aResult + bResult + sumResult);
    }
}
