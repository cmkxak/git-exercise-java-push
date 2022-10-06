package lecutre_1006.collection.map;

import lecutre_1006.collection.list.RandomAlphabetGenerator;

import java.util.HashMap;
import java.util.Map;

public class AlphabetExercise {
    public static void main(String[] args) {
        String s = "weq123123asdfa";
        String[] alphabets = s.split("");
        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        for (String alphabet : alphabets) {
            char c = alphabet.charAt(0);
            //1. 알파벳인지 판단
            if( (c>=65 && c<=90) || (c>=97 && c<=122)) {
                map.put(alphabet, ++count);
            }
        }
        System.out.println("알파벳 개수 : " + count);
    }
}
