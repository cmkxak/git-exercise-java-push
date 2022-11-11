package com.likelion.lecture.lecture_1111;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String binaryString = "";

        for (int i = 0; i < n; i++) {
            //둘 중에 하나만 1이어도 지도 상에서 1이 되므로, or 연산
            binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            binaryString = binaryString.replaceAll("1", "#");
            binaryString = binaryString.replaceAll("0", " ");

            //앞에 0이 오는 경우를 대비해서 자릿수를 맞춰준다.
            binaryString = String.format("%" + n + "s", binaryString);
            answer[i] = binaryString;
        }
        return answer;
    }
}
