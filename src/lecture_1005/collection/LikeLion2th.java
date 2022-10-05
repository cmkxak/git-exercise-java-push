package lecture_1005.collection;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();

    public LikeLion2th() {
        Names names = new Names();
        this.students = names.makeStudentList();
    }

    //멋사 2기 학생들의 이름이 들어 있는 list를 return 하는 메소드
    public List<String> getStudentList(){
        return this.students;
    }
}
