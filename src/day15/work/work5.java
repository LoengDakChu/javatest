package day15.work;

import java.util.ArrayList;
import java.util.Random;

public class work5 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    System.out.println(Thread.currentThread().getName() + "正在通过山洞");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        ArrayList<Thread> list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(new Thread(r));
        }
        for (Thread t:list){
            t.start();
        }

    }
}
