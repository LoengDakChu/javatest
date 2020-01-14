package day12.work.SecondPass;

import java.util.ArrayList;
import java.util.Iterator;

public class work5 {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("老炮",18,1.78));
        list.add(new Person("王爷",17,1.68));
        list.add(new Person("黄碧",18,1.90));
        list.add(new Person("李四",19,1.60));
        list.add(new Person("王五",16,1.69));

        Iterator<Person> it = list.iterator();
        while (it.hasNext()){
            Person p = it.next();
            p.setAge(p.getAge()+2);
        }
        for (Person p:list){
            System.out.println("姓名："+p.getName()+"，年龄："+p.getAge()+"，身高："+p.getHeight());
        }
    }
}
