import java.util.Scanner;

public class MultipleOfNumber {
    /**
     * 생성자를 활용하여 문제를 풀어보시오.
     */
    private int multipleTargetNum = 0;

    public MultipleOfNumber(int multipleTargetNum){
        this.multipleTargetNum = multipleTargetNum;
    }

    public String isMultiple(int num){
        if(num % this.multipleTargetNum == 0){
            return "multiple";
        }else{
            return "not multiple";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        MultipleOfNumber multipleOfNumber = new MultipleOfNumber(7);

        String result = multipleOfNumber.isMultiple(num);

        System.out.println(result);
    }
}
