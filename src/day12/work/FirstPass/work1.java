package day12.work.FirstPass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class work1 {
    public static void main(String[] args) {
        /*
        * Collection基本方法
        * 1.public void add(E e)：把给定的对象添加到当前集合中
        * 2.public void clear()：清空当前集合
        * 3.public boolean remove(E e)：把给定的对象从当前数组中删除掉
        * 4.public boolean contains(E e)：判断给定的对象在不在当前集合中
        * 5.public int size()：返回当前集合的长度
        * 6.public boolean isEmpty()：判断当前集合是否为空集合
        * 7.public Object[] toArray()：把集合中的元素，存储到数组中*/

        Collection<String> coll=new ArrayList<>();
        //添加元素
        coll.add("剑魔");
        coll.add("蛮子");
        coll.add("徳玛");
        coll.add("提莫");
        System.out.println(coll);
        //删除元素
        coll.remove("提莫");
        System.out.println("删除提莫"+coll);
        //获取集合的长度
        System.out.println(coll.size());
        //清空集合
        coll.clear();
        System.out.println(coll);


    }
}
