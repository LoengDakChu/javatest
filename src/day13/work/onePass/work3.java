package day13.work;

import java.util.LinkedList;
import java.util.List;

public class work3 {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("大");
        list.add(0,"小");
        System.out.println(list);

        list.set(0,"好");
        System.out.println(list);

        String s = list.get(0);
        System.out.println(s);

        int size = list.size();
        System.out.println(size);

        String remove = list.remove(1);
        System.out.println(remove);

        list.clear();
        System.out.println(list);
    }
}
