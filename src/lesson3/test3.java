package lesson3;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int count = sc.nextInt();
        int[] mas = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter integer value " + i + " : ");
            mas[i] = sc.nextInt();
        }
        sc.close();
        sort(mas);
        for (int m: mas) {
            System.out.println(m);
        }
    }

    public static void sort(int[] mas) {
        int buff = 0;
        for (int i = mas.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    buff = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = buff;
                }
            }
        }
    }
}
