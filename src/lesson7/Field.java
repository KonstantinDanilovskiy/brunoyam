package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private char [][] field = new char[12][30];
    Robot robot;
    private boolean gameover = false;
 //   private List<List> doubleList = new ArrayList<>();


    public Field(Robot robot) {
        this.robot = robot;
    }

    public boolean isGameover() {
        return gameover;
    }

    public void createField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = '*';
            }
        }
    }

   public void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
       System.out.println("\n \n \n");
    }

    public void moveRobot(Direction direction) {
        if (direction == Direction.UP) {
            robot.setX(robot.getX() - 1);
            if (robot.getX() < 0) gameover = true;
        }
        if (direction == Direction.DOWN) {
            robot.setX(robot.getX() + 1);
            if (robot.getX() >= field.length) gameover = true;
        }
        if (direction == Direction.LEFT) {
            robot.setY(robot.getY() - 1);
            if (robot.getY() < field[0].length) gameover = true;

        }
        if (direction == Direction.RIGHT) {
            robot.setY(robot.getY() + 1);
            if (robot.getY() >= field[0].length) gameover = true;

        }
    }

    public void setRobot() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (robot.getY() == j && robot.getX() == i) field[i][j] = robot.getTrace();
            }
        }
    }

}
