package day14.work1.threePass;

import java.util.*;

public class work3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        while (hashSet.size() < 4) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                int anInt = new Random().nextInt(10);
                str.append(anInt);
            }
            String s = str.toString();
            hashSet.add(s);
        }

        String[] arr = {"西瓜", "苹果", "香蕉", "橘子"};


        HashMap<String, String> map = new HashMap<>();
        Iterator<String> it = hashSet.iterator();
        int i=0;
        while (it.hasNext()) {
            String s = it.next();
            map.put(s, arr[i]);
            i++;
        }

        System.out.println(map);
        System.out.println("请输入商品号查询");
        String id = new Scanner(System.in).next();
        if (map.containsKey(id)) {
            String value = map.get(id);
            System.out.println("根据商品号：" + id + "查询到对应的商品为：" + value);
        } else {
            System.out.println("查无此商品");
        }


    }
}
