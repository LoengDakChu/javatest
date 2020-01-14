package day13.work.twopass;

import java.util.Iterator;
import java.util.LinkedList;

public class work3 {
    public static void main(String[] args) {
        String[] strarr={"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list=new LinkedList<>();
        for (String s:strarr){
            if (!list.contains(s)){
                list.add(s);
            }
        }
        //增强for循环
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("=============");
        //获取list集合的迭代器
        Iterator<String> it = list.iterator();
        //迭代器遍历集合
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
