package day15.work;

public class Sale implements Runnable {
    private Cup cup;

    public Sale(Cup cup) {
        this.cup = cup;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (cup) {
                int num = cup.getNum();
                if (num <= 0) {
                    System.out.println("杯子卖完了");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "：正在卖第" + cup.getNum() + "个");
                num--;
                cup.setNum(num);
                System.out.println("还剩"+cup.getNum());
            }
        }
    }
}
