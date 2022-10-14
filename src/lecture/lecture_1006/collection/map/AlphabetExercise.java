package lecture.lecture_1006.collection.map;

import java.util.HashMap;
import java.util.Map;

public class AlphabetExercise {
    public static void main(String[] args) {
        String s = "1!@#$%%^!@#$%^weq123123asdfaz";
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isAlphabet(c)){
                map.put(c, ++count);
            }
        }
        System.out.println("알파벳 개수 : " + count);
    }

    public static boolean isAlphabet(char c){
        if((c >= 65 && c<=90) || (c>=97 && c<=122)){
            return true;
        }else{
            return false;
        }
    }
}
