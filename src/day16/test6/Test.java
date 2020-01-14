package day16.test6;

import day16.test.MyCall;

import java.util.concurrent.FutureTask;

public class Test {

    public static void main(String[] args) throws Exception {
        MyCall myCall = new MyCall();
        FutureTask<Object> task = new FutureTask<>(myCall);
        Thread thread = new Thread(task);
        thread.start();
//        Object obj = task.get();
//        System.out.println(obj);

        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
        }
    }
}
