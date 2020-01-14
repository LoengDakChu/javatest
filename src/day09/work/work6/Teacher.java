package day09.work.work6;

public class Teacher extends Person  {
    @Override
    public void eat() {
        System.out.println("工作餐");
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
}
