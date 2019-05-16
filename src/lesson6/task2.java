package lesson6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int[] age = {20, 30, 40, 50, 60, 70};
        String[] name = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6"};
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < age.length; i++) {
            map.put(age[i], name[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст человека:");
        int selectedAge = scanner.nextInt();
        for (Integer i : map.keySet()) {
            if (selectedAge == i) System.out.println(map.get(i));
        }
    }
}
