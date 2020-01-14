package day10.work.work2;

import java.util.ArrayList;

public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void callName(ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            Student student=list.get(i);
            if (!student.getName().equals("小明")){
                student.setCome(true);
            }
        }
    }
}
