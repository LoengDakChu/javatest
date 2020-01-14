package day16.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) {
        SwimmingCallable s=new SwimmingCallable();
        FutureTask<Object> obj=new FutureTask<>(s);
        ExecutorService service= Executors.newFixedThreadPool(3);
        service.submit(obj);
        service.submit(obj);
        service.submit(obj);
    }
}
