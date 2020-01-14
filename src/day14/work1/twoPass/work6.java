package day14.work1.twoPass;

import java.util.*;

public class work6 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character,Integer> map=new HashMap<>();
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            char[] chars = str.toCharArray();
            for (Character c:chars){
                if (!map.containsKey(c)){
                    map.put(c,1);
                }else {
                    Integer value = map.get(c);
                    map.put(c,++value);
                }
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        StringBuilder str=new StringBuilder();
        for (Map.Entry<Character, Integer> entry:entries){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            str.append(key+" = "+value+",");
        }
        System.out.println(str);
    }
}
