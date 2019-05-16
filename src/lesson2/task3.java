package lesson2;

// возвести число n в степень k

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число n: ");
        int n = scanner.nextInt();
        System.out.println("введите степень числа k: ");
        int k = scanner.nextInt();
        int result = n;
        for (int i = 1; i < k; i++) {
            result *= n;
        }
        System.out.println("число " + n + " в степени " + k + " = " + result);
    }
}
