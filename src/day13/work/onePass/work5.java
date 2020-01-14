package day13.work;


import java.util.HashSet;
import java.util.Iterator;


public class work5 {
    public static void main(String[] args) {
        HashSet<String> setList=new HashSet<>();
        setList.add("zhangsan");
        setList.add("list");
        setList.add("wangwu");
        setList.add("zhangsan");

        Iterator<String> it = setList.iterator();

        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
