package hw.hw_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split(" ");

        System.out.println(Integer.parseInt(str[0]) == 1 || Integer.parseInt(str[1]) ==1 ? 1 : 0);
    }
}
