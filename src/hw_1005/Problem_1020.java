package hw_1005;

import java.util.Scanner;

public class Problem_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] splitNums = nums.split("-");

        for(String num : splitNums){
            System.out.print(num);
        }
    }
}
