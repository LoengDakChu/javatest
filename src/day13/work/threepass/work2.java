package day13.work.threepass;

import java.util.HashSet;
import java.util.Iterator;

public class work2 {
    public static void main(String[] args) {
        HashSet<HashSet<Student>> xueKe=new HashSet<>();
        HashSet<Student> class1=new HashSet<>();
        HashSet<Student> class2=new HashSet<>();
        class1.add(new Student("小马",16));
        class1.add(new Student("大马",18));
        class2.add(new Student("小马",16));
        class2.add(new Student("中马",19));
        xueKe.add(class1);
        xueKe.add(class2);
        Iterator<HashSet<Student>> it = xueKe.iterator();
        while (it.hasNext()){
            HashSet<Student> c = it.next();
            for (Student s:c){
                System.out.println(s);
            }
        }
    }
}
