package day08.homework.work6;

public class Chicken extends Animal{
    public Chicken() {
    }

    public Chicken(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(super.getAge()+"岁的"+super.getColor()+"公鸡在啄米");
    }
    public void Call(){
        System.out.println(super.getAge()+"岁的"+super.getColor()+"公鸡在打鸣");
    }
}
