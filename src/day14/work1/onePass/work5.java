package day14.work1.onePass;

import java.util.*;

public class work5 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("邓c","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","杨颖");
        map.put("谢霆锋","张柏芝");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> m:entries){
            String key = m.getKey();
            String value = m.getValue();
            System.out.println(key+"的CP"+value);
        }
        System.out.println("============");
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"的CP"+value);
        }
        System.out.println("==============");
        entries.stream().forEach(a->{
            String key = a.getKey();
            String value = a.getValue();
            System.out.println(key+"的CP"+value);
        });
    }
}
