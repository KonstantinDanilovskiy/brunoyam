package lesson5;

import java.util.*;
import java.util.Collections;

public class task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(20));
        }
        if (contain(list, 10)) System.out.println("Элемент содержится в массиве.");
        else System.out.println("Элемент отсутвует в массиве.");
        System.out.println("Максимальный элемент списка: " + maximum(list));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static boolean contain(List<Integer> list, int x) {
        for (Integer i: list) {
            if (x == i) return true;
        }
        return false;
    }

    public static Integer maximum(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer i: list) {
            if (i > max) max = i;
        }
        return max;
    }



}