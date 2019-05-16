package lesson8;

public class View {
    Field field;

    public View(Field field) {
        this.field = field;
    }

    public void printField() {
        for (int i = 0; i < field.getField().length; i++) {
            for (int j = 0; j < field.getField()[0].length; j++) {
                System.out.print(field.getField()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n \n \n");
    }

}
