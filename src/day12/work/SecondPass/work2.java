package day12.work.SecondPass;

import java.util.ArrayList;
import java.util.Iterator;

public class work2 {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("梁益",18,1.78));
        list.add(new Person("任二",17,1.68));
        list.add(new Person("张三",18,1.90));
        list.add(new Person("李四",19,1.60));
        list.add(new Person("王五",16,1.69));

        Iterator<Person> it = list.iterator();
        Person hp=new Person();
        Person lp=new Person();
        double h=list.get(0).getHeight();
        double l=list.get(0).getHeight();
        while (it.hasNext()){
            Person p = it.next();
            if (p.getHeight()>h){
                h=p.getHeight();
                hp=p;
            }
            if (p.getHeight()<l){
                l=p.getHeight();
                lp=p;
            }
        }
        System.out.println("最高的人："+hp.getName()+"，身高："+hp.getHeight());
        System.out.println("最高的人："+lp.getName()+"，身高："+lp.getHeight());
    }
}
