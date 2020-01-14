package day13.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class work9 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        Collections.sort(list, (o1, o2) -> o1-o2);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        for (Integer i:list){
            System.out.println(i);
        }
    }
}
