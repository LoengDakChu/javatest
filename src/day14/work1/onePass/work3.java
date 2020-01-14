package day14.work1.onePass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class work3 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("黄明","杨颖");
        map.put("邓超","马伊琍");
        Collection<String> values = map.values();
        for (String v:values){
            System.out.println(v);
        }
        System.out.println("===============");
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
