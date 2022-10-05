package lecture_1005.collection;

public class Student {
    private int classNum;
    private String name;
    private String gitRepositoryAddress;

    public Student(int classNum, String name, String gitRepositoryAddress) {
        this.classNum = classNum;
        this.name = name;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }

    @Override
    public String toString(){
        return this.classNum + " " + this.name + " " + this.gitRepositoryAddress;
    }
}
