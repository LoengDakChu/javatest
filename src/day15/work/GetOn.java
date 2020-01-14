package day15.work;

public class GetOn implements Runnable{
    private Seat seat;

    public GetOn(Seat seat) {
        this.seat = seat;
    }

    @Override
    public void run() {
        while (true){
            synchronized (seat){
                int num = seat.getNum();
                if (num<=0){
                    System.out.println("满座了");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"上车"+"----还剩"+num+"个座位");
                num--;
                seat.setNum(num);
            }
        }
    }
}
