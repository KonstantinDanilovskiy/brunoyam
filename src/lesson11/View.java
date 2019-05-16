package lesson11;

public class View {
    private Field field;

    public View(Field field) {
        this.field = field;
    }

    public void showField() {
        for (int i = 0; i < field.size(); i++) {
            for (int j = 0; j < field.size(); j++) {
                System.out.print(field.getCell(j, i).getSign() + " ");
            }
            System.out.println("");
        }
    }



}
