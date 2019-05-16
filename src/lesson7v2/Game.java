package lesson7v2;


import java.io.*;
import java.util.Scanner;

public class Game {


    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        Robot robot = new Robot(5, 5);
        Field field = new Field(15, 20);
        InputStream keyboardInput = System.in;

        System.out.println("Введите тип управления (1- auto, 2-manual):");
        int mode = scanner.nextInt();
        if (mode == 1) {
            FileInputStream fis = new FileInputStream("auto.txt");
            byte[] buf = new byte[fis.available()];
            InputStream is = new ByteArrayInputStream(buf);

            while (fis.available() > 0) {
                fis.read(buf);
            }
            System.setIn(is);
            scanner.close();
            scanner = new Scanner(System.in);
        }

        View view = new View(field, robot);
        view.createField();
        while(!view.isGameover()) {
            Thread.sleep(200);
            if (mode == 2) {
                System.out.println("Для выхода из игры нажмите Q");
                System.out.println("Введите направление движения робота (a- на лево, d- на право, w- вверх, s - вниз) и количество шагов (= количеству букв) :");
            }
            String key = scanner.next();
            if (key.equals("q")) break;
            int i = key.length();
            if (i > 0) {
                if (String.valueOf(key.charAt(0)).equals("s")) {
                    while (i > 0) {
                        view.moveRobot(Direction.DOWN);
                        view.setRobot();
                        i--;
                    }
                } else if (String.valueOf(key.charAt(0)).equals("w")) {
                    while (i > 0) {
                        view.moveRobot(Direction.UP);
                        view.setRobot();
                        i--;
                    }
                } else if (String.valueOf(key.charAt(0)).equals("a")) {
                    while (i > 0) {
                        view.moveRobot(Direction.LEFT);
                        view.setRobot();
                        i--;
                    }
                } else if (String.valueOf(key.charAt(0)).equals("d")) {
                    while (i > 0) {
                        view.moveRobot(Direction.RIGHT);
                        view.setRobot();
                        i--;
                    }
                }
            }
            view.printField();
        }
        System.out.println("Game over!");


    }
}
