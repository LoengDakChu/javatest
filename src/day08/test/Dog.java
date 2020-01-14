package day08.test;

public class Dog extends Animals{
    public Dog() {
        super();
        System.out.println("子类无参构造");
    }

    public Dog(String name) {
        super(name);
    }
}
