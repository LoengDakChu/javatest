package day15.test;

public class Shower {
    int count=0;

    public void show1() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            synchronized (Object.class) {
                if (count!=0){
                    Object.class.wait();
                }
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
                count=1;
                Object.class.notify();
            }
        }
    }

    public void show2() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            synchronized (Object.class) {
                if (count!=1){
                    Object.class.wait();
                }
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
                count=0;
                Object.class.notify();
            }
        }
    }
}
