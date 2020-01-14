package day08.homework.work3;

public class work3 {
    public static void main(String[] args) {
        Dog dog=new Dog("旺财","黄色",1800);
        Cat cat=new Cat("波斯猫","绿色",2500);
        dog.eat();
        dog.lookhome();
        System.out.println("------------");
        cat.eat();
        cat.Catch();
    }
}
