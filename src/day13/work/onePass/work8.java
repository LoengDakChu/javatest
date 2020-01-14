package day13.work;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class work8 {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("王昭君");
        set.add("王昭君");
        set.add("西施");
        set.add("杨玉环");
        set.add("貂蝉");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("==========");
        for (String s:set){
            System.out.println(s);
        }
    }
}
