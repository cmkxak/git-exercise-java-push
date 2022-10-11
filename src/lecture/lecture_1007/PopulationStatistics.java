package lecture.lecture_1007;

import java.io.*;
import java.util.*;

public class PopulationStatistics {
    private FileManager fileManager;

    public PopulationStatistics(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public FileManager getFileManager() {
        return fileManager;
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public Map<String, Integer> getMoveCnt(List<PopulationMove> pml){
        Map<String, Integer> moveCnt = new HashMap<>();

        for( PopulationMove pm : pml){
            String key = pm.getFromSido() + "," + pm.getToSido(); //전출시,전입시 key 형태로 저장
            if(moveCnt.get(key) == null){
                moveCnt.put(key, 1); //1로 초기화
            }
            moveCnt.put(key, moveCnt.get(key)+1); //이미 존재하는 key값이면, 1이 누적되도록 함
        }
        return moveCnt; //Map 반환
    }

    public Map<String, Integer> heatMapIdx(){
        Map<String, Integer> map = new HashMap<>();

        map.put("11", 0);
        map.put("26", 1);
        map.put("27", 2);
        map.put("28", 3);
        map.put("29", 4);
        map.put("30", 5);
        map.put("31", 6);
        map.put("36", 7);
        map.put("41", 8);
        map.put("42", 9);
        map.put("43", 10);
        map.put("44", 11);
        map.put("45", 12);
        map.put("46", 13);
        map.put("47", 14);
        map.put("48", 15);
        map.put("50", 16);
        return map;
    }

    public static void main(String[] args) throws IOException {
        PopulationStatistics ps = new PopulationStatistics(new FileManager());
        FileManager fileManager = ps.getFileManager();

        String address = "C:\\2021_인구관련연간자료_20220927_66125.csv";
        String fromToAddress = "./from_to.txt";
        String targetFilename = "./for_heatmap.txt";

        List<PopulationMove> pml = fileManager.readByLine(fromToAddress);

        Map<String, Integer> heatmapIdx = ps.heatMapIdx();
        Map<String, Integer> moveCntMap = ps.getMoveCnt(pml);

        //heatmap 파일 생성 관련 로직
        List<String> cntResult = new ArrayList<>();
        fileManager.createAFile(targetFilename);

        Set<String> keys = moveCntMap.keySet();

        for (String key : keys) {
            String[] fromto = key.split(",");
            String s = String.format("[%s, %s, %d],\n", heatmapIdx.get(fromto[0]), heatmapIdx.get(fromto[1]), moveCntMap.get(key));
            cntResult.add(s);
        }

        fileManager.write(cntResult, targetFilename);
    }
}
