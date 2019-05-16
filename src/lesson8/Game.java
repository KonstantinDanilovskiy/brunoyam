package lesson8;

public class Game {


    public static void main(String[] args) {
        Field field = new Field(3, 3);
        View view = new View(field);
        view.printField();
    }
}
