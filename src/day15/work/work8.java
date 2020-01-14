package day15.work;

public class work8 {
    public static void main(String[] args) {
        TicketBean ticketBean=new TicketBean();
        Ticket ticket=new Ticket(ticketBean);
        Thread t1=new Thread(ticket,"窗口a");
        Thread t2=new Thread(ticket,"窗口b");
        Thread t3=new Thread(ticket,"窗口c");
        Thread t4=new Thread(ticket,"窗口d");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
