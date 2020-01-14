package day10.work.work4;

public class test {
    public static void main(String[] args) {
        Worker w1=new Worker();
        Apple a1=new Apple(5,"青色");
        Apple a2=new Apple(3,"红色");
        System.out.println("默认挑大的：");
        Apple apple = w1.pickApple(new Compare(), a1, a2);
        System.out.println(apple.getSize()+"-"+apple.getColor());


        System.out.println("挑红色的：");
        Worker w2=new Worker();
        Apple apple1 = w2.pickApple(new CompareAble() {
            @Override
            public Apple compare(Apple a1, Apple a2) {
                return "红色".equals(a1.getColor()) ? a1 : a2;
            }
        }, a1, a2);
        System.out.println(apple1.getSize()+"-"+apple1.getColor());
    }
}
