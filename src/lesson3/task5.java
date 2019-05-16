package lesson3;

//проверка, отсортирован ли массив
import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int count = scanner.nextInt();
        String[] mas = new String[count];
        for (int i=0; i < count; i++) {
            System.out.println("Введите элемент массива " + i + " : ");
            mas[i] = scanner.next();
        }
        Arrays.sort(mas);
//        for (String m: mas) {
//            System.out.println(m);
//        }
        if (checkSortedArray(mas)) System.out.println("Массив отсортирован");
        else System.out.println("Массив не отсортирован");
    }

    public static boolean checkSortedArray(String[] mas) {
        String[] buff = new String[mas.length];
        buff = mas.clone();
        Arrays.sort(mas);
        if (Arrays.equals(mas, buff)) return true;
        return false;
    }
}
