package lecture.lectrue_1012;

import java.util.Arrays;

public class Max02 {
    public void getMax(int arr[][]){
        int maxValue = arr[0][0];
        int maxIdx[] = new int[]{0,0};

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int a = arr[i][j]; // j가 먼저 바뀐다.
                //j가 0~9까지 한번씩 돌아감
                if (arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                    maxIdx[0] = i;
                    maxIdx[1] = j;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIdx[0] + "," + maxIdx[1]);
        System.out.println(Arrays.toString(maxIdx)); //배열의 내용 출력
    }

    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };
        Max02 max02 = new Max02();
        max02.getMax(arr);
    }
}


