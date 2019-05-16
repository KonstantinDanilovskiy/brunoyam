package lesson3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int count = sc.nextInt();
        String[] str = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter string " + i + " : ");
            str[i] = sc.next();
        }
        sc.close();
        System.out.println("The longest string: " +maxLength(str));
    }

    public static String maxLength(String[] mas) {
        int max = Integer.MIN_VALUE;
        String result = "";
        for (int i = 0 ; i < mas.length; i++) {
            if (mas[i].length() > max) {
                max = mas[i].length();
            }
        }
        for (int i = mas.length - 1; i >= 0 ; i--) {
            if (mas[i].length() == max) {
                result = mas[i];
                break;
            }
        }
        return result;
    }
}
