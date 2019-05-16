package lesson2;

//проверить является ли строка палиндромом

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку: ");
        String str = scanner.nextLine();
        if (str.length() % 2 != 0) {
            System.out.println("строка не является палиндромом");
        }
        else {
            int middle = str.length() / 2 - 1;
            String substring1 = str.substring(0, middle +1);
            String substring2 = str.substring(middle + 1);
            StringBuilder sb = new StringBuilder(substring2);
            sb.reverse();
            substring2 = sb.toString();
            if (substring1.equals(substring2)) {
                System.out.println("строка является палиндромом");
            } else {
                System.out.println("строка не является палиндромом");
            }

        }
    }
}
