package lesson3;

//замена всех чисел на их мксимальный делитель, который меньше самого числа
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");
            int count = scanner.nextInt();
            int[] mas = new int[count];
            for (int i = 0; i < count; i++) {
                System.out.println("Введите элемент массива " + i + " : ");
                mas[i] = scanner.nextInt();
            }
            int buff = 0;
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] != 1) buff = mas[i] - 1;
                else buff = 1;
                while (mas[i] % buff != 0) {
                    buff--;
                }
                mas[i] = buff;
            }

            for (int i: mas) {
                System.out.println(i);
            }
    }
}
