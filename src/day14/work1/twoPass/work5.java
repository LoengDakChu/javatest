package day14.work1.twoPass;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class work5 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        String str = new Scanner(System.in).nextLine();
        countingKey(str);

    }
    public static void countingKey(String str){
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (Character c : chars) {
            if (c >= '0' && c <= '9') {
                if (!map.containsKey("数字")){
                    map.put("数字",1);
                }else {
                    Integer value = map.get("数字");
                    map.put("数字",++value);
                }
            } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                if (!map.containsKey("字母")){
                    map.put("字母",1);
                }else {
                    Integer value = map.get("字母");
                    map.put("字母",++value);
                }
            }else if (c==32){
                if (!map.containsKey("空格")){
                    map.put("空格",1);
                }else {
                    Integer value = map.get("空格");
                    map.put("空格",++value);
                }
            }else {
                if (!map.containsKey("其他")){
                    map.put("其他",1);
                }else {
                    Integer value = map.get("其他");
                    map.put("其他",++value);
                }
            }
        }
        StringBuilder strB=new StringBuilder();
        Set<String> set = map.keySet();
        for (String key:set){
            Integer value = map.get(key);
            strB.append(key+"("+value+")");
        }
        System.out.println(strB);
    }
}
