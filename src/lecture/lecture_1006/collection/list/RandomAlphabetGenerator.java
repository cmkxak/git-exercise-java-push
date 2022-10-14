package lecture.lecture_1006.collection.list;

public class RandomAlphabetGenerator implements AlphabetGenerator{

    @Override
    public char create() {
        int num = (int) (Math.random() * 26+65);
        return (char) num;
    }
}
