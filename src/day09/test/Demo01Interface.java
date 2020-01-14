package day09.test;

public interface Demo01Interface {
    //抽象方法
    public abstract void eat();
    public abstract void sleep();

    //默认方法
    public default void fly(){
        System.out.println("飞");
    }
}
