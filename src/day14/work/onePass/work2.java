package day14.work.onePass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class work2 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("黄晓明","杨颖");
        map.put("邓超","马伊琍");
        Set<String> set = map.keySet();
        for (String s:set){
            System.out.println(s);
        }
        System.out.println("==========");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
    }
}
