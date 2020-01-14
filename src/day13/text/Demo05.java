package day13.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("rose", 18));
        list.add(new Student("jack", 16));
        list.add(new Student("abc", 16));
        list.add(new Student("ace", 17));
        list.add(new Student("mark", 16));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);
    }
}
