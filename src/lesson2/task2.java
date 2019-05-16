package lesson2;

// вычислить факториал числа n

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число n:");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i=1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("факториал числа " + n + ": " + factorial);
    }
}
