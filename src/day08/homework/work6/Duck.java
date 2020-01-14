package day08.homework.work6;

public class Duck extends Animal {
    public Duck() {
    }

    public Duck(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(super.getAge()+"岁的"+super.getColor()+"鸭子在吃饭");
    }
    public void swim(){
        System.out.println(super.getAge()+"岁的"+super.getColor()+"鸭子在游泳");
    }
}
