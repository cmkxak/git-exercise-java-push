package com.likelion.lecture.week3.lecture_1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    //한문자 읽기
    public void readByChar(String filename) throws IOException {
        FileReader fin = new FileReader(filename);

        int c = fin.read();

        String fileContents = "";
        while (fileContents.length() < 1000000) {
            char read = (char) fin.read();
            fileContents += read;
        }
        System.out.println(fileContents);
    }

    //모든 라인 읽기
    public List<PopulationMove> readByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str = null;
        while ((str = br.readLine()) != null) {
            PopulationMove parse = parse(str);
            pml.add(parse);
        }
        br.close();
        return pml;
    }

    //원하는 데이터만 parsing
    public PopulationMove parse(String data){
        String[] split = data.split(",");
        return new PopulationMove(split[0], split[1]);
    }

    //모든 줄 읽기
    public String readByLine2(String filename) {
        String line;
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {
            while ((line = br.readLine()) != null) {
                line += br.readLine();
                return line;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }

    public void createAFile(String filename){
        File file = new File(filename);
        try{
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename) throws IOException {
        File file = new File(filename);

        try{
            BufferedWriter br = new BufferedWriter(new FileWriter(file));
            for(String s : strs){
                br.write(s);
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
