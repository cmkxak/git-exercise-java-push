package com.likelion.lecture.week9;

import java.util.Arrays;

public class ErathosThenesPrac {
    public void ErathosThenes(int n){
        boolean b[] = new boolean[n+1];

        Arrays.fill(b, true);

        for(int i=2;i<Math.sqrt(n);i++){
            if(b[i]){
                int j = 2;
                while(i *j <= n){
                    b[i * j] = false;
                    j += 1;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(b[i]) System.out.printf("%s", i + " ");
        }
    }

    public static void main(String[] args) {
        ErathosThenesPrac erathosThenes = new ErathosThenesPrac();
        erathosThenes.ErathosThenes(50);

    }
}
