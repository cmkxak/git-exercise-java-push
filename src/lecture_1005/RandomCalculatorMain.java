package lecture_1005;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        RandomNumberImpl randomNumberImpl = new RandomNumberImpl();
        RandomCalculator randomCalculator = new RandomCalculator(10, randomNumberImpl);

        System.out.println(randomCalculator.plus());
        System.out.println(randomCalculator.minus());
        System.out.println(randomCalculator.multiple());
        System.out.println(randomCalculator.divide());
    }
}
