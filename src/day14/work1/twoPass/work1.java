package day14.work1.twoPass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class work1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        int i = 0;
        while (i < 5) {
            String str = new Scanner(System.in).next();
            if (str.contains(",")) {
                String[] split = str.split(",");
                String key = split[0];
                String v = split[1];
                try {
                    int anInt = Integer.parseInt(v);
                    Integer value = Integer.valueOf(anInt);
                    map.put(key, value);
                } catch (Exception e) {
                    System.out.println("请输入正确的年龄");
                    i--;
                }

            }
            i++;
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);
    }
}
