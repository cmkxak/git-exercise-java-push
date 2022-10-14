package lecture.lecture_1006.collection.list;

import java.util.HashSet;
import java.util.Set;

public class RndAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();

        Set<Character> alphabetSet = new HashSet<>();


        for(int i = 0; i<50 ;i++){
            char ch = randomAlphabetGenerator.create();
            alphabetSet.add(ch);
        }

        System.out.println("중복이 제거된 알파벳");
        System.out.println(alphabetSet);
        System.out.print("크기 : " + alphabetSet.size());
    }
}
