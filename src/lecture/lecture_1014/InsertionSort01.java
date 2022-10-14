package lecture.lecture_1014;

import java.util.Arrays;

public class InsertionSort01 {
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
        int arr[] = new int[]{8,5,6,2,4};
        InsertionSort01 is = new InsertionSort01();

        is.insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
