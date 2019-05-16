package lesson9;

import java.util.NoSuchElementException;

public class Game {
    private static int stepCount;

    public static void main(String[] args) {
        Field field = new Field();
        View view = new View(field);
        Controller controller = new Controller(field);
        while (!controller.isInitDone()) {
            try {
                controller.playersInit();
            } catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
        }

        while (stepCount < 5) {
            view.showField();
            if (controller.isWinner()) {
                System.out.println(controller.getPlayer2().getName() + " won");
                break;
            }
            do {
                System.out.println("Введите корректные координаты");
            }while(!controller.action1());
            view.showField();
            if (controller.isWinner()) {
                System.out.println(controller.getPlayer1().getName() + " won");
                break;
            }
            controller.action2();
            System.out.println("");
            stepCount++;
        }
        ConsoleHelper.close();
    }
}
