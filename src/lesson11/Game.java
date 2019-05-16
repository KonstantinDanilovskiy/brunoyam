package lesson11;

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
        while (stepCount < 9) {
            System.out.println("ход" + stepCount);
            controller.action(controller.getPlayer2());
            stepCount++;
        }


//        Player player = controller.getPlayer1();

//        while (stepCount < 9) {
//            view.showField();
//            do {
//                System.out.println("Введите корректные координаты");
//            }while(!controller.action(player));
//            if (controller.isWinner()) {
//                System.out.println(player.getName() + " won");
//                break;
//            }
//            System.out.println("");
//            stepCount++;
//            if (player instanceof Man) player = controller.getPlayer2();
//            else player = controller.getPlayer1();
//        }
        ConsoleHelper.close();
    }
}
