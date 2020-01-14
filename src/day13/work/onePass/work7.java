package day13.work;

import java.util.HashSet;

public class work7 {
    public static void main(String[] args) {
        HashSet<Person> hs=new HashSet<>();
        hs.add(new Person("小王",6));
        hs.add(new Person("大王",7));
        hs.add(new Person("中王",8));
        hs.add(new Person("半王",9));
        hs.add(new Person("小王",6));

        for (Person s:hs){
            System.out.println(s.getAge()+s.getName());
        }
    }
}
