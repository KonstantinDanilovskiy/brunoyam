package lesson2;

import java.util.Random;

public class CyclesExamples {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int j = 0; j < 100; j++) {

        }
        // бесконечный цикл
//        for ( ; ; ){
//            System.out.println("Hello");
//        }
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        Random r = new Random();
        int sum = 0;
        int[] m = new int[30];
        for (int mas : m) {
            mas = r.nextInt(40);
            sum += mas;
        }

        System.out.println((double) sum / (double) m.length);


    }
}
