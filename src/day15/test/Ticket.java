package day15.test;

public class Ticket implements Runnable{
    Integer num=100;
    private static Object obj=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (num<=0){
                    System.out.println("票已售罄");
                    break;
                }
                System.out.println(Thread.currentThread().getName()+ "：正在卖第：" + num + "张票");
                num--;
            }

        }

    }
}