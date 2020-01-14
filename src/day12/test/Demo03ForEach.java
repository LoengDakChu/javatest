package day12.test;

import day11.test.Person;
import day11.work.Goods;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03ForEach {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("小狸棺");
        coll.add("扫地僧");
        coll.add("石破天");
        for (String s:coll){
            System.out.println(s);
        }

        int[] ints={1,2,3,4,5};
        for (int i:ints){
            System.out.println(i);
        }

        ArrayList<Goods> goods = new ArrayList<>();
        goods.add(new Goods("001", "少林核桃", 15.5, "斤"));
        goods.add(new Goods("002", "尚康饼干", 14.5, "包"));
        goods.add(new Goods("003", "移动硬盘", 345.0, "个"));
        goods.add(new Goods("004", "高清无码", 199.0, "G"));
        for (Goods g:goods){
            System.out.println(g.getId()+g.getName());
        }
    }
}
