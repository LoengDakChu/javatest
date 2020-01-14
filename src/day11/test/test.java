package day11.test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Person p1=new Person("地理哑巴",18);
        Person p2=new Person("地理哑巴",18);
//        ArrayList<String> list=new ArrayList<>();
        boolean equals = p1.equals(p2);
        System.out.println(equals);
        String string = p1.toString();
        System.out.println(string);
    }
}
