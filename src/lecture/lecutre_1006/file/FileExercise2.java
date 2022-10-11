package lecture.lecutre_1006.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise2 {
    private String filename;

    public FileExercise2(String fileName) {
        this.filename = fileName;
    }

    public void printDir(File file) {
        File[] files = file.listFiles(); //현재 디렉토리 파일 목록

        for (File f : files) {
            System.out.println(f);
        }
    }

    //method 형태로 만들어주어야 확장 하기가 쉽다.
    public char readAchar() throws IOException {
        FileReader fileReader = new FileReader("./aFile.txt");
        return (char) fileReader.read(); //read() 메소드가 반환하는 것은 정수 - > 아스키 코드 값이 반환됨
    }

    public String readTwoChars() throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str+= (char) fileReader.read();
        str+= (char) fileReader.read();
        return str;
    }

    public String readNChars(int N) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        for(int i=0;i<N;i++){
            int read = fileReader.read();
            if(read != -1){
                str+= (char) read;
            }else{
                return str;
            }
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        FileExercise2 fileExercise = new FileExercise2("./aFile.txt");
        char c = fileExercise.readAchar();
        String twoLetters = fileExercise.readTwoChars();
        String nLetters = fileExercise.readNChars(6);

        //한글자 출력
        System.out.println("읽어온 한 글자 = " + c);
        //두글자 출력
        System.out.println("읽어온 두 글자 = " + twoLetters);
        //파일의 내용 길이 만큼 출력
        System.out.println("읽어온 N 글자 = " + nLetters);
    }
}
