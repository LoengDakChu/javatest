package day13.work.twopass;

import java.util.HashSet;
import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner s=new Scanner(System.in);
        String next = s.next();
        char[] chars = next.toCharArray();

        HashSet<Character> list=new HashSet<>();
        for (char ch:chars){
            list.add(ch);
        }
        System.out.println(list);
        for (Character c:list){
            System.out.println(c.hashCode());
        }
    }
}
