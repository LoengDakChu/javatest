package day09.work.work6;

public class Students extends Person {
    @Override
    public void eat() {
        System.out.println("学生餐");
    }

    public Students() {
    }

    public Students(String name, int age) {
        super(name, age);
    }
}
