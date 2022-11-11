package com.likelion.lecture.week3.lecture_1006.collection.list;

import com.likelion.lecture.week3.lecture_1005.numbergenerator.NumberGenerator;
import com.likelion.lecture.week3.lecture_1005.numbergenerator.RandomNumberGenerator;
import java.util.HashSet;
import java.util.Set;

public class RandomNumbersWithoutDuplicated {
    public static void main(String[] args) {
        NumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> numberSet = new HashSet<>();

        for(int i=0;i<50;i++){
            int nums = randomNumberGenerator.generate(10);
            numberSet.add(nums);
        }

        for (Integer num : numberSet) {
            System.out.println(num);
        }
    }
}
