package lecture.lecture_1013;

import java.util.Arrays;

public class SortTest {
    public int[] sort(int [] arr){
        int temp = 0;
        int i = 0 ;
        for (int j = i+1; j<arr.length; j++){
            if (arr[i] > arr[j]){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{7,2,3,9,28,11};
        SortTest s = new SortTest();
        int[] result = s.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
