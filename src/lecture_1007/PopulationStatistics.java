package lecture_1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PopulationStatistics {
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
        String str;
        while ((str = br.readLine()) != null) {
            PopulationMove parse = parse(str);
            pml.add(parse);
        }
        br.close();
        return pml;
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

    //원하는 데이터만 parsing
    public PopulationMove parse(String data){
        String[] split = data.split(",");
        return new PopulationMove(split[0], split[1]);
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

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public Map<String, Integer> getMoveCnt(List<PopulationMove> pml){
        Map<String, Integer> moveCnt = new HashMap<>();

        for( PopulationMove pm : pml){
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCnt.get(key) == null){
                moveCnt.put(key, 1);
            }
            moveCnt.put(key, moveCnt.get(key)+1);
        }
        return moveCnt;
    }

    public static void main(String[] args) throws IOException {
        String address = "C:\\2021_인구관련연간자료_20220927_66125.csv";
        String fromToAddress = "./from_to.txt";

        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readByLine(fromToAddress);

        Map<String, Integer> moveCntMap = ps.getMoveCnt(pml);

        //heatmap 파일 생성 관련 로직
        String targetFilename = "./for_heatmap.txt";
        ps.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        Set<String> keys = moveCntMap.keySet();
        for (String key : keys) {
            String[] split = key.split(",");
            String s = String.format("[%s, %s, %d]\n", split[0], split[1], moveCntMap.get(key));
            cntResult.add(s);
        }
        ps.write(cntResult, targetFilename);


        //파일 생성
//        List<String> strings = new ArrayList<>();
//        for (PopulationMove populationMove : pml) {
//            String fromTo = ps.fromToString(populationMove);
//            strings.add(fromTo);
//        }
//        ps.write(strings,"./from_to.txt");

//        for (PopulationMove pm : pml) {
//            System.out.printf("전입: %s, 전출:%s \n", pm.getFromSido(), pm.getToSido());
//        }
    }
}
