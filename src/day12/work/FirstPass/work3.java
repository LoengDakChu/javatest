package day12.work.FirstPass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class work3 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
