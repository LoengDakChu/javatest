package day10.test;

public class Demo1 {
    public static void main(String[] args) {
        new NeiBuLei() {
            @Override
            public void shou() {
                System.out.println("这是匿名内部类！");
            }
        }.shou();
    }
}
