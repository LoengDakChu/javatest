package day13.work;

import java.util.ArrayList;

public class work10 {
    public static void main(String[] args) {
        ArrayList<String> strings = add("1", "2", "3");
        for (String s:strings){
            System.out.println(s);
        }
    }
    public static ArrayList<String> add(String...arr) {
        ArrayList<String> list=new ArrayList<>();
        for (String s:arr){
            list.add(s);
        }
        return list;
    }
}
