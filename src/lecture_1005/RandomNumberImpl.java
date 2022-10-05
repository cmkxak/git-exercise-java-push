package lecture_1005;

import java.util.Random;

public class RandomNumberImpl implements RandomNumber{
    private int randomNumber;

    @Override
    public int getRandomNumber() {
        return (int) ((Math.random() * (10 - 0)));
    }
}
