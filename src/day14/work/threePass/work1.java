package day14.work.threePass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class work1 {
    public static void main(String[] args) {
        HashMap<String,String> ji=new HashMap<>();
        ji.put("001","李晨");
        ji.put("002","范冰冰");
        HashMap<String,String> jiu=new HashMap<>();
        jiu.put("001","马云");
        jiu.put("002","马化腾");

        HashMap<String,HashMap<String,String>> map=new HashMap<>();
        map.put("java基础班",ji);
        map.put("java就业班",jiu);

        Set<String> set = map.keySet();
        for (String key:set){
            System.out.println(key);
            HashMap<String, String> value = map.get(key);
            Set<String> set1 = value.keySet();
            for (String id:set1){
                String name = value.get(id);
                System.out.println(id+name);
            }
        }


    }
}
