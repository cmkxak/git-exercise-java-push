package lecutre_1006.collection.map;

import lecutre_1006.collection.list.RandomAlphabetGenerator;

import java.util.HashMap;
import java.util.Map;

public class AlphabetExercise {
    public static void main(String[] args) {
        String s = "1!@#$%%^!@#$%^weq123123asdfa";
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c >= 65 && c<=90) || (c>=97 && c<=121)){
                map.put(c, ++count);
            }
        }
        System.out.println("알파벳 개수 : " + count);
    }
}
