package lesson9;

public class Robot extends Player {
    private Field field;

    public Robot(Cell sign, Field field) {
        super(sign, "Robot");
        this.field = field;
    }



    protected int[] positionChoiсe() {
        int[] coordinates = new int[2];
        for (int i = 0; i < field.size(); i++) {
            for (int j = 0; j < field.size(); j++) {
                if (field.getCell(i, j) == Cell.EMPTY) {
                    coordinates[0] = i;
                    coordinates[1] = j;
                }
            }
        }
        return coordinates;
    }
}
