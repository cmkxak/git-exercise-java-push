package com.likelion.lecture.week9.lecture_1118;

//불통과

public class Password {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                answer += c;
            } else if (c >= 'a' && c <= 'z') {
                if (c + n > 'z') {
                    answer += (char) (c - 26 + n);
                } else {
                    answer += (char) (c + n);
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (c + n > 'Z') {
                    answer += (char) (c - 26 + n);
                } else {
                    answer += (char) (c + n);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Password password = new Password();
        System.out.println(password.solution("AB", 1));
        System.out.println(password.solution("z", 1));
        System.out.println(password.solution("a B z", 4));
    }
}
