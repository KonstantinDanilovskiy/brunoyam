package lesson2;

//посчитать сумму чисел от 1 до n

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число n:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i=1; i <= n; i++) {
            sum += i;
        }
        System.out.println("сумма чисел от 1 до " + n + ": " + sum);
    }
}
