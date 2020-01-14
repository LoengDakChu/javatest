package day14.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02ForMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("黄晓明","杨颖");
        map.put("邓超","孙俪");
        map.put("文章","马伊琍");

        Set<String> set = map.keySet();
        for (String s:set){
            String p = map.get(s);
            System.out.println(s+"的cp是"+p);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> s:entries){
            System.out.println(s);
        }
    }
}
