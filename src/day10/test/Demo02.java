package day10.test;

public class Demo02 {
    public static void main(String[] args) {

        new Start(()->{
            System.out.println("执行任务");
        }).run();
    }
}
