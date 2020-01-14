package day13.work.twopass;

import java.util.HashSet;
import java.util.Iterator;

public class work4 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("王一", 10, "男"));
        hashSet.add(new Student("王二", 12, "男"));
        hashSet.add(new Student("王三", 13, "男"));
        hashSet.add(new Student("王四", 47, "男"));
        hashSet.add(new Student("王五", 56, "男"));
        hashSet.add(new Student("王六", 10, "女"));
        hashSet.add(new Student("王七", 38, "男"));
        hashSet.add(new Student("王八", 22, "女"));
        hashSet.add(new Student("王一", 10, "男"));
        hashSet.add(new Student("王二", 12, "男"));

        for (Student s : hashSet) {
            System.out.println(s);
        }
        System.out.println("==============");
        Iterator<Student> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
