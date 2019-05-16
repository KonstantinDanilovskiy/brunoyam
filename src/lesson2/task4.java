package lesson2;

//посчитать сумму цифр числа

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число n: ");
        int n = scanner.nextInt();
        String str = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println("сумма цифр числа: " + sum);
    }
}
