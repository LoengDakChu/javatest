package day08.homework.work5;

public class Teacher extends Person {
    private String course;

    public Teacher(){

    }

    public Teacher(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void teacher(){
        System.out.println(super.getName()+"老师，讲授"+this.course+"课");
    }
}
