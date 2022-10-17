package lecture.lecture_1017;

import java.util.Scanner;

public class RightTriangle {

    private String letter = "*";

    public RightTriangle(){}

    public RightTriangle(String letter){
        this.letter = letter;
    }

    public void getRightTriangle(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle("#");
        Scanner sc = new Scanner(System.in);
        System.out.printf("개수를 입력하세요 : ");
        int n = sc.nextInt();
        rt.getRightTriangle(n);
    }
}
