package day16.test;

public class Swimming implements Runnable{

    @Override
    public void run() {
        System.out.println("我需要一个游泳教练");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了："+Thread.currentThread().getName());
        System.out.println("教我游泳,交完后，教练回到了游泳池"+Thread.currentThread().getName());
    }
}
