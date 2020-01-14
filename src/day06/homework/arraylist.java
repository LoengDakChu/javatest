package day06.homework;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("铁扇公主");
        String s = list.get(3);
        System.out.println("索引值为3的是："+s);
        list.set(3, "唐僧");
        list.remove(1);
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
