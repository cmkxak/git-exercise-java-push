package lecture_1005;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,20);
        System.out.println(calculator.plus());
        System.out.println(calculator.minus());
        System.out.println(calculator.multiple());
        System.out.println(calculator.divide());
    }

}
