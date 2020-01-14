package day14.work.twoPass;

import day12.work.SecondPass.Person;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class work7 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println("请录入英文语句");
        String str = new Scanner(System.in).nextLine();
        String[] split = str.split(" ");
        for (String s:split){
            if (!map.containsKey(s)){
                map.put(s,1);
            }else {
                Integer value = map.get(s);
                map.put(s,++value);
            }
        }
        Set<String> set = map.keySet();
        for (String key:set){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
