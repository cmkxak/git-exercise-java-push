package lecutre_1006.collection.list;

import lecture_1005.numbergenerator.NumberGenerator;
import lecture_1005.numbergenerator.RandomNumberGenerator;

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
