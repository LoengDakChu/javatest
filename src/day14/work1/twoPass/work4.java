package day14.work1.twoPass;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class work4 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        System.out.println("请输入一个字符串");
        String str = new Scanner(System.in).next();
        char[] chars = str.toCharArray();
        for(Character c:chars){
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                Integer value = map.get(c);
                map.put(c,++value);
            }
        }
        StringBuilder s=new StringBuilder();
        Set<Character> keySet = map.keySet();
        for (Character c:keySet){
            Integer value = map.get(c);
            s.append(c+"("+value+")");
        }
        System.out.println(s);

    }
}
