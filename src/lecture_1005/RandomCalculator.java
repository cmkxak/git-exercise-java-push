package lecture_1005;

public class RandomCalculator {
    private int a;
    private RandomNumber randomNumber;

    public RandomCalculator(int a, RandomNumber randomNumber){
        this.a = a;
        this.randomNumber = randomNumber;
    }

    public int plus(){
        return a + randomNumber.getRandomNumber();
    }

    public int minus(){
        return a - randomNumber.getRandomNumber();
    }

    public int multiple(){
        return a * randomNumber.getRandomNumber();
    }

    public float divide(){
        try{
            return (float) a / randomNumber.getRandomNumber() ;
        }catch(Exception e){
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
        return (float) a / randomNumber.getRandomNumber();
    }
}
