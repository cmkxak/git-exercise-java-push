package hw.hw_1011;

import java.util.Scanner;

public class Problem_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result =(int)(a * Math.pow(2, b));
        System.out.println(result);
    }
}
