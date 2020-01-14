package day15.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {
    ReentrantLock lock = new ReentrantLock();
    Condition c1;
    Condition c2;
    Condition c3;

    public Printer() {
        c1 = lock.newCondition();
        c2 = lock.newCondition();
        c3 = lock.newCondition();
    }

    int count = 1;

    public void show1() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            lock.lock();
            if (count != 1) {
                c1.await();
            }
            System.out.print("我");
            System.out.print("是");
            System.out.print("中");
            System.out.print("国");
            System.out.print("人");
            System.out.println();
            count = 2;
            c2.signal();
            lock.unlock();
        }
    }

    public void show2() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            lock.lock();
            if (count != 2) {
                c2.await();
            }
            System.out.print("犯");
            System.out.print("我");
            System.out.print("中");
            System.out.print("华");
            System.out.print("者");
            System.out.println();
            count = 3;
            c3.signal();
            lock.unlock();
        }
    }

    public void show3() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            lock.lock();
            if (count != 3) {
                c3.await();
            }
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
            count = 1;
            c1.signal();
            lock.unlock();
        }
    }
}
