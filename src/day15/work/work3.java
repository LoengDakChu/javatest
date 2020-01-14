package day15.work;

public class work3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"：主线程");
//        MYThread m=new MYThread();
//        m.start();

        RunnableImpl r=new RunnableImpl();
        Thread t=new Thread(r,"子线程：");
        t.start();
    }
}
