package lecture.lecture_1014;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] insertionSort(int[] arr){
        int i = 1;
        int tmp;

        if(arr[i] < arr[i-1]){
            tmp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = tmp;
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
