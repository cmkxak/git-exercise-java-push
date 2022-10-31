package com.likelion.lecture.lecture_1028;

public class MockExam {
        public int[] solution(int[] answers) {
            int[] answer = {};

            int student1 = {1,2,3,4,5};
            int student2 = {2,1,2,3,2,4,2,5};
            int student3 = {3,3,1,1,2,2,4,4,5,5};

            int []count = new int[3];

            //나머지 연산자를 활용하여 각 수포자의 정답을 담아주기.
            for(int i=0;i<answers.length;i++){
                if (answers[i] == (student1[i%5])){
                    count[0]++;
                }

                if (answers[i] == (student2[i%5])) {
                    count[1]++;
                }

                if (answers[i] == (student1[i%5])) {
                    count[2]++;
                }
            }

            //가장 높은 점수를 받은 사람 -> 오름차순 정렬하기

            return answer;
        }
}
