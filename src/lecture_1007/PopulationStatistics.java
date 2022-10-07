package lecture_1007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

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

    public void readByLine(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }

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

    public PopulationMove parse(String data){
        int fromSido = 0, toSido = 0;

        String[] split = data.split(",");

        for(int i =0;i<split.length; i++) {
            fromSido = Integer.parseInt(split[0]);
            toSido = Integer.parseInt(split[6]);
        }
        return new PopulationMove(fromSido, toSido);
    }

    public static void main(String[] args) throws IOException {
        PopulationStatistics ps = new PopulationStatistics();
//        ps.readByChar("C:\\2021_인구관련연간자료_20220927_66125.csv");
//        ps.readByLine("C:\\2021_인구관련연간자료_20220927_66125.csv");
        String data = "41,650,25000,2021,05,21,11,290,68500,3,8,059,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,347226";
        PopulationMove populationMove = ps.parse(data);
        System.out.println(populationMove.getFromSido());
        System.out.println(populationMove.getToSido());
    }
}
