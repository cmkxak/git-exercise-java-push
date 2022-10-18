package lecture.lecture_1018;

import java.util.Scanner;

public class SquareStar {
    public void getSquareStar(int x, int y){
        for(int i=0;i<x;i++){
            System.out.println("*".repeat(y));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SquareStar square = new SquareStar();
        int x = sc.nextInt();
        int y = sc.nextInt();
        square.getSquareStar(x,y);
    }
}
