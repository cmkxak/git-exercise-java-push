package com.likelion.lecture_1027;

import java.util.HashSet;

/**
 * 프로그래머스 : 전화번호 목록
 */
public class PhoneBook {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();

        for (String num : phone_book) {
            set.add(num);

            for (int i = 0; i < phone_book.length; i++) {
                for (int j = 0; j < phone_book[i].length(); j++) {
                    if (set.contains(phone_book[i].substring(0, j)))
                        return false;
                }
            }
            return true;
        }
    }
}
