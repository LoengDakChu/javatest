package day14.work.twoPass;

import java.util.*;

public class work9 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        System.out.println("请输出书名，价格，用逗号隔开");
        while (map.size() < 5) {
            String str = new Scanner(System.in).next();
            String[] split = str.split(",");
            String num = split[1];
            Double price = Double.valueOf(num);
            map.put(split[0], price);
        }

        map.remove("C++");
        map.put("Java",38.5);

        Set<String> set = map.keySet();
        for (String key:set){
            Double value = map.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("============");
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Iterator<Map.Entry<String, Double>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, Double> entry = it.next();
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
