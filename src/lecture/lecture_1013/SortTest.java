package lecture.lecture_1013;

import java.util.Arrays;

public class SortTest {
    public int[] sort(int [] arr){
        int temp = 0;

        for(int i =0;i<arr.length-1;i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,4,2,5,6,7,11,23,9,21};
        SortTest s = new SortTest();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
