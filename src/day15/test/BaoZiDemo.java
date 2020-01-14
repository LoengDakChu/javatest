package day15.test;

public class BaoZiDemo {
    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi();
        baoZi.setFlag(5);
        Producer producer=new Producer(baoZi);
        Customer customer=new Customer(baoZi);
        Thread t1=new Thread(producer,"商家");
        Thread t2=new Thread(customer,"顾客");
        t1.start();
        t2.start();
    }
}
