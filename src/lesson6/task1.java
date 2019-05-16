package lesson6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"))) {
            int count = Integer.parseInt(fileReader.readLine());
            for (int i = 0; i < count; i++) {
                String s = fileReader.readLine();
                int day = Integer.parseInt(s.substring(0, s.indexOf(" ")));
                int temp = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
                map.put(day, temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println(e);
        }
        int selectedDay;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день месяца:");
        try {
            selectedDay = scanner.nextInt();
            for (Integer i : map.keySet()) {
                if (selectedDay == i) System.out.println(map.get(i));
            }
            } catch(InputMismatchException e) {
            System.out.println("Введен корректный день месяца.");
        }

    }
}
