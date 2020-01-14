package day10.work.work2;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("小红");
        Student s2=new Student("小亮");
        Student s3=new Student("小明");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Teacher teacher=new Teacher("张老师");
        Course course=new Course("java",teacher,list);
        teacher.callName(list);
        course.show();
    }
}
