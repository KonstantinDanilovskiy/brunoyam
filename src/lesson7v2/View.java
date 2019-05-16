package lesson7v2;

public class View {
    private Field field;
    private Robot robot;
    private boolean gameover = false;

    public View(Field field, Robot robot) {
        this.field = field;
        this.robot = robot;
    }

    public boolean isGameover() {
        return gameover;
    }

    public void createField() {
        field.createField();
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

    public void moveRobot(Direction direction) {
        if (direction == Direction.UP) {
            robot.setX(robot.getX() - 1);
            if (robot.getX() < 0) gameover = true;
        }
        if (direction == Direction.DOWN) {
            robot.setX(robot.getX() + 1);
            if (robot.getX() >= field.getField().length) gameover = true;
        }
        if (direction == Direction.LEFT) {
            robot.setY(robot.getY() - 1);
            if (robot.getY() < 0) gameover = true;

        }
        if (direction == Direction.RIGHT) {
            robot.setY(robot.getY() + 1);
            if (robot.getY() >= field.getField()[0].length) gameover = true;

        }
    }

    public void setRobot() {
        for (int i = 0; i < field.getField().length; i++) {
            for (int j = 0; j < field.getField()[0].length; j++) {
                if (robot.getY() == j && robot.getX() == i) field.getField()[i][j] = robot.getTrace();
            }
        }
    }

}
