package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int count = sc.nextInt();
        String[] mas = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter integer value " + i + " : ");
            mas[i] = sc.next();
        }
        sc.close();
        System.out.println(maxSumElement(mas));
    }

    public static String maxSumElement (String[] mas) {
        int[] sum = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length() ; j++) {
                sum[i] += Character.getNumericValue(mas[i].charAt(j));
            }
        }
        return mas[maxIndexElement(sum)];
    }

    public static int maxIndexElement (int[] intmas) {
        int max = Integer.MIN_VALUE;
        int a = 0;
        for (int i = 0; i < intmas.length; i++) {
            if (intmas[i] > max) {
                max = intmas[i];
                a = i;
            }
        }
        return a;
    }

}
