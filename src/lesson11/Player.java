package lesson11;

public abstract class Player {
    private Cell sign;
    private String name;

    public Player(Cell sign, String name) {
        this.sign = sign;
        this.name = name;
    }

    public Cell getSign() {
        return sign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract int[] positionChoiсe();

}
