package day15.work;

public class work6 {
    public static void main(String[] args) {
        Cup cup=new Cup();
        Sale s=new Sale(cup);
        Thread t1=new Thread(s,"实体店");
        Thread t2=new Thread(s,"官网");
        t1.start();
        t2.start();
    }
}
