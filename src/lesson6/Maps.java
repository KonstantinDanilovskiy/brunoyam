package lesson6;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "hello2");
        map.putIfAbsent(1, "sdfgdsfgds"); //добавляет элемент только в том случае, если в коллекции отсутствует ключ
        map.put(5, "Integer");
        System.out.println(map);
        System.out.println(map.get(45)); // возвращает null, если элемент отсутствует в мапе
        System.out.println(map.getOrDefault(45, "not found")); //возвращает defaultvalue, если элемент отсутствует в мапе

        Set<Integer> set = map.keySet();
        Collection<String> collection = map.values();
        List<String> list = new ArrayList<>(collection);

    }
}
