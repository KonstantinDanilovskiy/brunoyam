package lesson2;

//проверить делится ли большое число на 3

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите большое число: ");
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        if ((sum % 3) != 0) {
            System.out.println("число не делится на 3");
        } else {
            System.out.println("число делится на 3");
        }
    }
}
