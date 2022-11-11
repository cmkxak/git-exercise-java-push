package com.likelion.lecture.week3.lecture_1006.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("홍길동");
        this.students.add("홍길순");
        this.students.add("홍길둥");
        this.students.add("홍길뚱");
        this.students.add("홍길수");
    }

    public List<String> getStudents() {
        return students;
    }
}
