package lesson11;

public class Man extends Player {
    public Man(Cell sign, String name) {
        super(sign, name);
    }

    public int[] positionChoiсe() {
        int[] coordinates = new int[2];

        System.out.println(getName() + " Введите координату x (в диапазоне 0 - 2)");
        coordinates[0] = ConsoleHelper.readInt();
        System.out.println(getName() + " Введите координату y (в диапазоне 0 - 2)");
        coordinates[1] = ConsoleHelper.readInt();
        return coordinates;
    }

}
