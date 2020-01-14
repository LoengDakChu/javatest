package day14.work.onePass;

import java.util.HashMap;

public class work1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("911GT2S",3200000);
        map.put("918spyder",13000000);
        map.put("911GT2S",4600000);
        Integer price = map.get("911GT2S");
        System.out.println(price);

        Integer remove = map.remove("911GT2S");
        System.out.println(remove);
        System.out.println(map);
    }
}
