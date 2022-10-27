package com.likelion.lecture.lecture_1026;
import java.util.*;

/**
 * 문제 접근
 * 1. HashMap에 모든 참가자 put
 *     1. key에 해당하는 값이 이미 존재하면 그 값에 1을 더하도록 하고,
 *     2. key에 값이 없다면, 0으로 초기화 후 1을 더해줍니다.
 *
 *     (이 때, key값은 각 선수들의 이름입니다.)
 *
 * 2. HashMap에 모든 완주자 put
 *     1. 모두 완주자를 put하면서, key에 대한 value의 값은 -1을 해줍니다.
 *     2. 1번의 과정에서 참여자를 put할 때 초기화 해줬었던 value 값에서 1을 빼줍니다.
 *     3. 완주한 선수들의 value 값은 0이 되었을 것 입니다.
 *
 * 3. 모든 key를 순회하면서, key에 대한 값이 0이 아닐 때,
 *    그 값은 위에서 언급했듯이 완주하지 못한 선수의 값이므로, key를 반환하도록 합니다.
 */

public class HashProblem {
    public String solution(String[] participant, String[] completion) {
            String result = "";
            HashMap<String, Integer> answer = new HashMap<>();
            for(String p : participant){
                answer.put(p, answer.getOrDefault(p,0) + 1);
            }
            for(String c : completion){
                answer.put(c, answer.get(c) - 1 );
            }
            for (String key : answer.keySet()){
                if (answer.get(key) != 0){
                    result = key;
                }
            }
            return result;
        }

    public String solution2(String [] participant, String[] completion){
        String result = "";
        HashMap<String, Integer> answer = new HashMap<>();
        for (String p : participant) {
            if(!answer.containsKey(p)) {
                answer.put(p, 0);
            }
            answer.put(p, answer.get(p) + 1);
        }
        for ( String c : completion){
            answer.put(c, answer.get(c) - 1);
        }
        for(String key : answer.keySet()){
            if(answer.get(key) != 0){
                result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        HashProblem hashProblem = new HashProblem();
        String failedPlayer = hashProblem.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String failedPlayer2 = hashProblem.solution2(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});;

        System.out.println("완주하지 못한 선수 = " + failedPlayer);
        System.out.println("완주하지 못한 선수 = " + failedPlayer2);
    }
}
