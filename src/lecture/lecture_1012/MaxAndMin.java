package lecture.lecture_1012;

interface Compare{
    boolean doSomeThing(int a, int b);
}
public class MaxAndMin { //3
    private int getMaxorMin(int arr[], Compare compare){
        int targetValue = arr[0];

        for(int i = 0;i<arr.length;i++){
            boolean isSth = compare.doSomeThing(arr[i], targetValue);
            if(isSth){
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public int max(int[] arr){
        return getMaxorMin(arr, new Compare(){
            @Override
            public boolean doSomeThing(int a, int b) {
                return a>b;
            }
        });
    }

    public int min(int [] arr){
        return getMaxorMin(arr, new Compare() {
            @Override
            public boolean doSomeThing(int a, int b) {
                return a<b;
            }
        });
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 23, 85, 34, 17, 74, 25, 52, 65};

         MaxAndMin m = new MaxAndMin();
        int max = m.max(arr);
        int min = m.min(arr);
        System.out.println(max);
        System.out.println(min);
    }
}
