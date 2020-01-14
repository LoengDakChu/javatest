package day12.test;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("小狸棺");
        coll.add("扫地僧");
        coll.add("石破天");
        System.out.println(coll);

        System.out.println("判断扫地僧在不在集合里面："+coll.contains("扫地僧"));

        System.out.println("删除石破天这个元素："+coll.remove("石破天"));
        System.out.println("删除后的数组："+coll);

        //Object[] toArray()转换成一个Object数组
        Object[] objects = coll.toArray();
        //遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        //清空集合
        coll.clear();
        System.out.println("清空集合："+coll);

        boolean empty = coll.isEmpty();
        System.out.println("判断集合是否为空"+empty);


//        ArrayList<String> list=new ArrayList<>();
//        list.add("111");
//        list.add("222");
//        list.add("11331");
//        System.out.println(list);

    }
}
