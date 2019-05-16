package lesson13;

public class Const implements Expression {

    private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int calculate() {
        return value;
    }

}
