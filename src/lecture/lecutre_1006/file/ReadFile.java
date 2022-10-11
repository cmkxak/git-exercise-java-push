package lecture.lecutre_1006.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private String filename;

    public ReadFile(String filename){
        this.filename = filename;
    }

    char readAByte(){
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            char line = (char) br.read(); //한 바이트 읽기
            System.out.println(line); //출력
            return line; //한 바이트 읽은 문자 리턴
        }catch(IOException e){ //입출력 예외 처리시
            throw new RuntimeException(e); //런타임으로 예외 처리
        }
    }

    void readNByte(int N) throws IOException {
        FileReader fileReader = new FileReader(filename);
        for(int i=0;i<N;i++){
            int read = fileReader.read();
            System.out.print((char) read + "");
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("aFile.txt");
        readFile.readAByte(); // 한 바이트 읽기
        readFile.readNByte(6); // N 바이트 읽기
    }
}
