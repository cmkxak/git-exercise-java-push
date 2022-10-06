package lecutre_1006.file;

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
            char line = (char) br.read();
            System.out.println(line);
            return line;
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("aFile.txt");
        readFile.readAByte();
    }
}
