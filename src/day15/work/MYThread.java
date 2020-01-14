package day15.work;

public class MYThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"子线程");
    }
}
