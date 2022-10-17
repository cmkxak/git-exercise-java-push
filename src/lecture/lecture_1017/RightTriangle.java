package lecture.lecture_1017;

import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("개수를 입력하세요 : ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
