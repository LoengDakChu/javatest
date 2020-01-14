package day15.test;

public class test01 {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Thread t1=new Thread(ticket,"广州南");
        Thread t2=new Thread(ticket,"深圳北");
        Thread t3=new Thread(ticket,"武汉");
        t1.start();
        t2.start();
        t3.start();
    }
}
