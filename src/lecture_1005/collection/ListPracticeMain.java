package lecture_1005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> studentList = likeLion2th.getStudentList();

        for (String student : studentList) {
            System.out.println(student);
        }
    }
}
