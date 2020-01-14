package day12.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("小狸棺");
        coll.add("扫地僧");
        coll.add("石破天");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String next = it.next();
            String next1 = it.next();
            System.out.println(next);
        }
    }
}
