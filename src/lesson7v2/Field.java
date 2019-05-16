package lesson7v2;


public class Field {
    private char [][] field;

    public Field(int y, int x) {
        this.field = new char[y][x];
    }

    public char[][] getField() {
        return field;
    }

    public void createField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = '.';
            }
        }
    }

}
