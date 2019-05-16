package lesson9;

public class Field {
    private Cell[][] field;
    private final int DEFAULT_SIZE = 3;

    public Field() {
        field = new Cell[DEFAULT_SIZE][DEFAULT_SIZE];
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            for (int j = 0; j < DEFAULT_SIZE; j++) {
                field[j][i] = Cell.EMPTY;
            }
        }
    }

    public boolean setCell(int x, int y, Cell value) {
        if (x < 0 || x>= size() || y < 0 || y >= size()) return false;
        if (field[x][y] == Cell.EMPTY) {
            field[x][y] = value;
            return true;
        }
        return false;
    }

    public Cell getCell(int x, int y) {
        return field[x][y];
    }

    public int size() {
        return field.length;
    }

}
