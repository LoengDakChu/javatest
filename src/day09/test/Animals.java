package day09.test;

public class Animals implements Demo01Interface {
    @Override
    public void eat() {
        System.out.println("吃东西！");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉觉");
    }
}
