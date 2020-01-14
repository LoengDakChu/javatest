package day07.test;

import java.sql.Array;
import java.util.Arrays;

public class Demo04String {
    public static void main(String[] args) {
        String str="[User{name=马云, age=56, money=2500.0}, User{name=马化腾, age=56, money=2400.0}, User{name=马赛克, age=56, money=2500.0}]";
        String substring = str.substring(1, str.length()-1);
        String replace = substring.replace("}", "");
        String[] split = replace.split("User\\{");
        String[] result=new String[3];
        String[] result1=new String[3];
        for (int i = 1; i < split.length; i++) {
            System.out.println(split[i]);
            String s=split[i];
            String[] split1 = s.split("=");
            result[i-1]=split1[1];
        }
        for (int i = 0; i < result.length; i++) {
            String s=result[i];
            String[] split2 = s.split(",");
            result1[i]=split2[0];
            System.out.println(result1[i]);
        }
        String s = Arrays.toString(result1);
        System.out.println(s);

    }
}
