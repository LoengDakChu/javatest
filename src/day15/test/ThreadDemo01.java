package day15.test;

public class ThreadDemo01 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    //当i等于50的时候让当前线程睡眠1秒钟(1000毫秒)
//                    if (i == 50) {
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }.start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("main-"+i);
        }
    }
}
