package lesson8;

public class Field {
    private Cell[][] field;

    public Field(int x, int y) {
        this.field = new Cell[x][y];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = Cell.EMPTY;
            }

        }
    }

    public Field(Cell[][] field) {
        this.field = field;
    }

    public Cell[][] getField() {
        return field;
    }
}
