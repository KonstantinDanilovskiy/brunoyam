package lesson11;

public enum Cell {
    EMPTY("."),
    ZERO("O"),
    CROSS("X");

    private String sign;

    private Cell(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
