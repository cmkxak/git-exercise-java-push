package lecture.lecture_1018;

import java.util.Scanner;

public class CodeUp1356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            if(i == 0 || i == n-1){
                System.out.println("*".repeat(n));
            }else{
                for(int j =0; j < n; j++){
                    if (j == 0 || j == n-1){
                        System.out.printf("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
