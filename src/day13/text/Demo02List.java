package day13.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo02List {
    public static void main(String[] args) {
        Collection<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();
        list2.add("图图");
        list2.add("笑笑");
        list2.add("说说");

        list2.add(1,"大二");
        System.out.println(list2);
    }
}
