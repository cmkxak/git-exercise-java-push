package hw_1006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        String[] splitedTimes = time.split(":");

        String str = splitedTimes[1].equals("00") ? splitedTimes[1] = "0" : splitedTimes[1];
        System.out.println(str);
    }
}
