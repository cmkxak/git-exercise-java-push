package lecture.lecture_1014;

import java.util.*;

public class CodeUpInsertionSort {
    public int[] insertionSort(int[] arr){
        int tmp;

        for(int i =1; i<arr.length; i++){
            for(int j= i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        CodeUpInsertionSort is = new CodeUpInsertionSort();
        is.insertionSort(arr);

        for(int a: arr){
            System.out.println(a);
        };
    }
}

