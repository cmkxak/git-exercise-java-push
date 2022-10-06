package lecutre_1006.file;

import java.io.File;

public class FileExercise {
    public static void main(String[] args) {
        File dir = new File("./");
        File[] files = dir.listFiles(); //현재 디렉토리 파일 목록

        for (File file : files) {
            System.out.println(file);
        }
    }
}
