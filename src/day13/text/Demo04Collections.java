package day13.text;

import java.util.*;

public class Demo04Collections {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(1);
        set.add(3);
        Collections.addAll(set, 5, 4, 6);
        System.out.println(set);

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(3);

        System.out.println(list);

//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

        Collections.sort(list, (Integer a, Integer b) -> {
            return b - a;
        });
        System.out.println(list);


    }
}
