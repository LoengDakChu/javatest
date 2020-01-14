package day13.work;

import java.util.LinkedList;
import java.util.List;

public class work4 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //添加元素到集合的最前面
        list.addFirst(0);
        //添加元素到集合的最后面
        list.addLast(5);
        System.out.println(list);

        //获取集合的第一个元素
        Integer first = list.getFirst();
        System.out.println(first);
        //获取集合的最后一个元素
        Integer last = list.getLast();
        System.out.println(last);

        //删除集合的第一个元素
        Integer integer = list.removeFirst();
        System.out.println(integer);
        //删除集合的最后一个元素
        Integer integer1 = list.removeLast();
        System.out.println(integer1);

        System.out.println(list);

    }
}
