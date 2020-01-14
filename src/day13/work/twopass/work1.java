package day13.work.twopass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class work1 {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<String> list=new ArrayList<>();
        //往集合里面添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add("d");

        //创建HashSet集合
        HashSet<String> set=new HashSet<>();
        //把list集合放到HashSet里面去重
        set.addAll(list);
        //清空list集合
        list.clear();
        //把set里面的元素放回list里面
        for (String s:set){
            list.add(s);
        }
        System.out.println(list);

    }
}
