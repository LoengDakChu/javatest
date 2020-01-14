package day12.work.SecondPass;

import java.util.ArrayList;

public class work3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        frequency(list,"b");
    }

    public static void frequency(ArrayList<String> arr, String key) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(key)) {
                count++;
            }
        }
        System.out.println(key+"出现的次数："+count);
    }
}
