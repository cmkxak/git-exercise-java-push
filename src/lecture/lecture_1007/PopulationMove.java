package lecture.lecture_1007;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public PopulationMove(String fromSido, String toSido){
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    public int getFromSido() {
        return fromSido;
    }

    public void setFromSido(int fromSido) {
        this.fromSido = fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public void setToSido(int toSido) {
        this.toSido = toSido;
    }



}
