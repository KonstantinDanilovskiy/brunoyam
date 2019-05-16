package lesson11;

import java.util.NoSuchElementException;

public class Controller {
    private Field field;
    private Player player1;
    private Player player2;
    private final String DEFAULT_NAME_1 = "Player #1";
    private final String DEFAULT_NAME_2 = "Player #2";
    private boolean isInitDone = false;

    public Controller(Field field) {
        this.field = field;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public boolean isInitDone() {
        return isInitDone;
    }

    public void playersInit() throws NoSuchElementException {
        player1 = createPlayer(DEFAULT_NAME_1);

        System.out.println("Выберите режим второго игрока (man или auto):");
        String mode = ConsoleHelper.readString();
        if (mode.equals("man")) player2 = createPlayer(DEFAULT_NAME_2);
        else if (mode.equals("auto")) {
            System.out.println("Выберите уровень сложности (1- просто, 2-сложно):");
            int modeOfComplexity = ConsoleHelper.readInt();
            if (modeOfComplexity == 1) player2 = createRobot(Robot.class);
                else player2 = createRobot(SmartRobot.class);
        }
        else {
            player1 = null;
            throw new NoSuchElementException("Выбран некорректный режим для второго игрока");
        }

        isInitDone = true;

        System.out.printf("Игроают:\t%s (знак %s) VS %s (знак %s)\n", player1.getName(), player1.getSign(), player2.getName(), player2.getSign());
    }

    private Player createPlayer(String defaultName) throws NoSuchElementException {
        String name;
        String sign;
        Cell selectedCell;

        System.out.println("Введите имя игрока " + defaultName + ":");
        name = ConsoleHelper.readString();
        if (name.equals("")) name = defaultName;
        if (player1 == null) {
            System.out.println("Выберите знак (X или O):");
            sign = ConsoleHelper.readString();
            if (sign.equalsIgnoreCase("X")) selectedCell = Cell.CROSS;
            else if (sign.equalsIgnoreCase("O")) selectedCell = Cell.ZERO;
            else if (sign.equals("")) selectedCell = Cell.CROSS;
            else throw new NoSuchElementException("Выбран некорректный знак");
        }
        else {
            if (player1.getSign() == Cell.CROSS) selectedCell = Cell.ZERO;
            else selectedCell = Cell.CROSS;
        }
        return new Man(selectedCell, name);
    }

    private Player createRobot(Class player) {
        if (player1.getSign() == Cell.CROSS) {
            if (player == Robot.class) return new Robot(Cell.ZERO, field);
            else return new SmartRobot(Cell.ZERO, field);
        }
        else {
            if (player == Robot.class) return new Robot(Cell.CROSS, field);
            else return new SmartRobot(Cell.CROSS, field);
        }
    }

    public boolean action(Player player) {
        int[] coordinates = player.positionChoiсe();
        return field.setCell(coordinates[0], coordinates[1], player.getSign());
    }

    public boolean isWinner() {
        int crossCountHorizont, crossCountVertical, zeroCountHorizont, zeroCountVertical;
        for (int i = 0; i < field.size(); i++) {
            crossCountHorizont = 0;
            crossCountVertical = 0;
            zeroCountHorizont = 0;
            zeroCountVertical = 0;
            for (int j = 0; j < field.size(); j++) {
                if (field.getCell(j,i) == Cell.CROSS) crossCountHorizont++;
                if (field.getCell(i,j) == Cell.CROSS) crossCountVertical++;
                if (field.getCell(j,i) == Cell.ZERO) zeroCountHorizont++;
                if (field.getCell(i,j) == Cell.ZERO) zeroCountVertical++;
            }
            if (crossCountHorizont == 3 || crossCountVertical == 3 || zeroCountHorizont == 3 || zeroCountVertical == 3) return true;
        }

        if (field.getCell(0,0) == Cell.CROSS && field.getCell(1,1) == Cell.CROSS && field.getCell(2,2) == Cell.CROSS) return true;
        if (field.getCell(0,2) == Cell.CROSS && field.getCell(1,1) == Cell.CROSS && field.getCell(2,0) == Cell.CROSS) return true;
        if (field.getCell(0,0) == Cell.ZERO && field.getCell(1,1) == Cell.ZERO && field.getCell(2,2) == Cell.ZERO) return true;
        if (field.getCell(0,2) == Cell.ZERO && field.getCell(1,1) == Cell.ZERO && field.getCell(2,0) == Cell.ZERO) return true;
        return false;
    }

}
