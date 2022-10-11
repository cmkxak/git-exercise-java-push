package hw.hw_1006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ymd = br.readLine();

        String[] ymdSplited = ymd.split("[.]");

        int d = Integer.parseInt(ymdSplited[2]);
        int m = Integer.parseInt(ymdSplited[1]);
        int y = Integer.parseInt(ymdSplited[0]);
//        System.out.println(d);
        System.out.printf("%02d-%02d-%04d", d,m,y);

    }
}
