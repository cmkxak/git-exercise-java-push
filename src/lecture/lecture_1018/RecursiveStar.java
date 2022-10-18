package lecture.lecture_1018;

import java.util.Scanner;

public class RecursiveStar {
    public void printStar(int n){
        if(n <= 0){
            return;
        }
        printStar(n-1);
        System.out.print("*");
    }

    public void printLine(int n){
        if(n <= 0){
            return;
        }
        printLine(n-1);
        printStar(n);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecursiveStar rs = new RecursiveStar();
        int i = sc.nextInt();
        rs.printLine(i);
    }
}
