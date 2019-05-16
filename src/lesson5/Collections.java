package lesson5;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List list = new ArrayList(10);
        java.util.Collections.fill(list, 0);

        list.add(5);
        list.add(5.5);
        list.add("hi");
     //   list.add(5,5);
        System.out.println(list.size());
        System.out.println(list.toString());

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 56, 7, 8));
      //  java.util.Collections.fill(list2, 10);
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>(list2);
        System.out.println(list3.size());
        System.out.println(list3.getClass().getName());

        Set<Integer> set = new HashSet<>();
//        set.add(12);
        set.add(4);
        set.add(20);
        set.add(1);
        set.add(12);
        set.add(100);
        System.out.println(set);
    }

}
