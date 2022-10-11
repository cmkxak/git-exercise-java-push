package lecture_1011;

public class SumOfDigit {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(123);
    }
}

class Solution {
        public int solution(int n) {
            int answer = 0;
            String s = Integer.toString(n);

            for(int i=0;i<s.length();i++){
                answer += Integer.parseInt(s.substring(i, i+1));
            }
            System.out.println(answer);
            return answer;
        }
}