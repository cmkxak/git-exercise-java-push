package com.likelion.lecture.week7.lecture_1031;

import java.util.ArrayList;

public class MockExam {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();

        int student1[] = {1,2,3,4,5};
        int student2[] = {2,1,2,3,2,4,2,5};
        int student3[] = {3,3,1,1,2,2,4,4,5,5};

        int count[] = new int[3];

        //나머지 연산자를 활용하여 각 정답을 담아주기.
        for(int i=0;i<answers.length;i++){
            if (answers[i] == student1[i%5]){
                count[0]++;
            }

            if (answers[i] == student2[i%8]) {
                count[1]++;
            }

            if (answers[i] == student3[i%10]) {
                count[2]++;
            }
        }
        int maxScore = Math.max(count[0], Math.max(count[1], count[2]));
        //배열로 최댓값이 같은 경우를 비교하려고 했지만, 높은 점수를 받은 사람이 한명인 경우
        // 3개의 크기에서 나머지 배열의 자리는 자동으로 0으로 초기화 되기 때문에 list로 활용
        for(int i=0;i<count.length;i++){
            if (count[i] == maxScore){
                answer.add(i+1);
            }
        }

        int maxStudentList[] = new int[answer.size()];
        int idx = 0;

        for (int ans : answer){
            maxStudentList[idx++] = ans;
        }
        return maxStudentList;
    }

    public static void main(String[] args) {
        MockExam exam = new MockExam();
        exam.solution(new int[]{1, 2, 3, 4, 5});
    }
}
