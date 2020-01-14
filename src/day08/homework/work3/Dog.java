package day08.homework.work3;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }
    public void lookhome(){
        System.out.println(super.getName()+"看家");
    }
}
