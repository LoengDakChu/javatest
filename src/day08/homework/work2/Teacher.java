package day08.homework.work2;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println(super.getName()+"上课");
    }
}
