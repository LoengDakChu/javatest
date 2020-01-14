package day10.work.work2;

import java.util.ArrayList;

public class Course {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> list;

    public Course() {
    }

    public Course(String name, Teacher teacher, ArrayList<Student> list) {
        this.name = name;
        this.teacher = teacher;
        this.list = list;
    }


    public void show(){
        System.out.println("课程名称："+name);
        System.out.println("授课老师："+teacher.getName());
        for (int i = 0; i < list.size(); i++) {
            Student student=list.get(i);
            if (student.isCome()){
                System.out.println("上课："+student.getName());
            }else{
                System.out.println("旷课："+student.getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
}
