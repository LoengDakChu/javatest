package day15.work;

public class work7 {
    public static void main(String[] args) {
        Seat seat=new Seat();
        GetOn getOn=new GetOn(seat);
        Thread t1=new Thread(getOn,"前门");
        Thread t2=new Thread(getOn,"中门");
        Thread t3=new Thread(getOn,"后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
