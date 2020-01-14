package day14.work1.onePass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class work4 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","杨颖");
        map.put("谢霆锋","张柏芝");

        Set<String> set = map.keySet();
        for (String key:set){
            String va = map.get(key);
            System.out.println(key+"的CP"+va);
        }
        System.out.println("=================");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String va = map.get(key);
            System.out.println(key+"的CP"+va);
        }
    }
}
