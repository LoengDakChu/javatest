package day15.work;

public class Ticket implements Runnable {
    private TicketBean ticketBean;

    public Ticket(TicketBean ticketBean) {
        this.ticketBean = ticketBean;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this){
                int num = ticketBean.getNum();
                if (num<=0){
                    System.out.println("票已售罄");
                    break;
                }
                ticketBean.setNum(num-1);
                System.out.println(Thread.currentThread().getName()+"卖了一张票，剩余票数为"+ticketBean.getNum());

            }
        }
    }
}
