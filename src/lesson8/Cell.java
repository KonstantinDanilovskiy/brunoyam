package lesson8;

public enum Cell {
    ZERO('O'),
    CROSS('X'),
    EMPTY('.');

    private char value;

    private Cell(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
