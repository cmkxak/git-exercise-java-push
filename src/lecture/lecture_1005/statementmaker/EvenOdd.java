package lecture.lecture_1005.statementmaker;

public class EvenOdd {
    private WordMaker wordMaker;

    public EvenOdd(WordMaker wordMaker) {
        this.wordMaker = wordMaker;
    }

    //홀,짝수 판별
    public void getEvenOdd(int num) {
        System.out.println(wordMaker.getWordMaker(num));
    }
}
