package day14.work1.twoPass;

import java.util.HashMap;
import java.util.Set;

public class work2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("柳岩",2100);
        map.put("张亮",1700);
        map.put("诸葛亮",1800);
        map.put("灭绝师太",2600);
        map.put("东方不败",3800);
        map.put("柳岩",2400);
        Set<String> set = map.keySet();
        for (String key:set){
            Integer value = map.get(key);
            System.out.println(key+"工资："+value);
        }
    }
}
