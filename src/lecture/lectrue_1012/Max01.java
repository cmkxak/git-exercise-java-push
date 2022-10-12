package lecture.lectrue_1012;

/**
 * 코드업 2081
 */
public class Max01 {
    public void getMax(int[] arr){
        int max = arr[0]; //arr이 모두 음수인 경우 0으로하면 0이 max값이 되므로 배열의 첫번째값으로 초기화
        int maxIdx = 0;

        for(int i = 1;i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                maxIdx = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        Max01 max = new Max01();
        max.getMax(arr);
    }
}
