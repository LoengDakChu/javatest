package day14.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("黄晓明","杨颖");
        map.put("邓超","孙俪");
        map.put("文章","马伊琍");
        System.out.println(map);

        String remove = map.remove("黄晓明");
        System.out.println(remove);
        System.out.println(map);

        String s = map.get("邓超");
        System.out.println(s);

        boolean b = map.containsKey("邓超");
        System.out.println(b);
        boolean b1 = map.containsValue("孙俪");
        System.out.println(b1);

        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);


    }
}
