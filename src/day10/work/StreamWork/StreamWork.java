package day10.work.StreamWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWork {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        Student s11 = new Student("梁裕梅", 17, 81);
        Student s12 = new Student("张悦可", 16, 92);
        Student s13 = new Student("冯爰美", 18, 76);
        Student s14 = new Student("梁傲蕾", 15, 66);
        Student s15 = new Student("王彤彤", 16, 79);
        Student s16 = new Student("梁黛娥", 19, 85);
        list1.add(s11);
        list1.add(s12);
        list1.add(s13);
        list1.add(s14);
        list1.add(s15);
        list1.add(s16);

        List<Student> list2 = new ArrayList<>();
        Student s21 = new Student("张虹玉", 21, 96);
        Student s22 = new Student("王海冬", 19, 97);
        Student s23 = new Student("梁弘雅", 18, 88);
        Student s24 = new Student("张问薇", 19, 67);
        Student s25 = new Student("黄曾燕", 20, 69);
        Student s26 = new Student("张千易", 17, 73);
        Student s27 = new Student("冯提莫", 18, 59);
        list2.add(s21);
        list2.add(s22);
        list2.add(s23);
        list2.add(s24);
        list2.add(s25);
        list2.add(s26);
        list2.add(s27);


        f1(list1, list2);
        System.out.println("==================================");
        f2(list1, list2);
        System.out.println("==================================");
        f3(list1, list2);

    }

    public static void f1(List<Student> classA, List<Student> classB) {
        long class1 = classA.stream().count();
        System.out.println("一班有" + class1 + "人");
        long class2 = classB.stream().count();
        System.out.println("一班有" + class2 + "人");
        //把一班和二班拼接变成stream流
        Stream<Student> concat = Stream.concat(classA.stream(), classB.stream());
        //然后过滤出姓梁的 再把流转回数组
        List<Student> studentList = concat.filter((s) -> {
            return s.getName().startsWith("梁");
        }).collect(Collectors.toList());
        //把姓梁的学生数组变成流，再遍历出每个姓梁的学生名字
        studentList.stream().forEach((s) -> {
            System.out.println(s.getName());
        });
    }

    public static void f2(List<Student> classA, List<Student> classB) {
        List<Student> students = Stream.concat(classA.stream(), classB.stream()).collect(Collectors.toList());
        students.stream().sorted((a, b) -> {
            if (a.getAge()==b.getAge()){
                return a.getScore() - b.getScore();
            }
            return b.getAge() - a.getAge();
        }).forEach((s) -> {
            System.out.println("学生：" + s.getName() + "，年龄：" + s.getAge() + "，分数：" + s.getScore());
        });

    }

    public static void f3(List<Student> classA, List<Student> classB) {
        System.out.println("2个班中姓张并且年龄小于18的学生：");
        Stream<Student> concat = Stream.concat(classA.stream(), classB.stream());
        concat.filter((s) -> {
            return s.getName().startsWith("张") && s.getAge() < 18;
        }).limit(3).forEach((s) -> {
            System.out.println(s.getName() + "," + s.getAge());
        });
    }
}
