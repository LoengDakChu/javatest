package day16.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        Swimming s=new Swimming();
        ExecutorService service= Executors.newFixedThreadPool(3);
        service.submit(s);
        service.submit(s);
        service.submit(s);
    }
}
