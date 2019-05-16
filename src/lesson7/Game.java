package lesson7;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
 //   private List<Character> list = new LinkedList<Character>();


    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Robot robot = new Robot(5, 5);
        Field field = new Field(robot);
        field.createField();
        while(!field.isGameover()) {
            Thread.sleep(300);
            System.out.println("Введите направление движения робота (a- на лево, d- на право, w- вверх, s - вниз):");
            String key = scanner.nextLine();
            if (key.equals("s")) {
                field.moveRobot(Direction.DOWN);
            }
            else if (key.equals("w")) {
                field.moveRobot(Direction.UP);
            }
            else if (key.equals("a")) {
                field.moveRobot(Direction.LEFT);
            }
            else if (key.equals("d")) {
                field.moveRobot(Direction.RIGHT);
            }
            field.setRobot();
            field.printField();
        }
        System.out.println("Game over!");


    }
}
