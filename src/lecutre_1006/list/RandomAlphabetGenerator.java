package lecutre_1006.list;

public class RandomAlphabetGenerator implements AlphabetGenerator{

    @Override
    public char create() {
        int num = (int) (Math.random() * 26+65);
        return (char) num;
    }
}
