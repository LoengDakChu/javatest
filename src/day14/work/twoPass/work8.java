package day14.work.twoPass;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class work8 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("请录入一个姓名");
        while (map.size()<5) {
            String name = new Scanner(System.in).next();
            map.put(name, new Random().nextInt(101));
        }
        Set<String> set = map.keySet();
        int max=0;
        int min=0;
        int sum=0;
        for (String key:set){
            Integer value = map.get(key);
            sum+=value;
            if (value>max){
                max=value;
            }else if (min<value){
                min=value;
            }
        }
        System.out.println("总分="+sum);
        System.out.println("最高分="+max);
        System.out.println("最低分="+min);
        System.out.println("平均分="+sum/map.size());
    }
}
