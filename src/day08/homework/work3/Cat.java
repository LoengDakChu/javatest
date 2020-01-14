package day08.homework.work3;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color, double price) {
        super(name, color, price);
    }
    public void Catch(){
        System.out.println(super.getName()+"抓老鼠");
    }
}
