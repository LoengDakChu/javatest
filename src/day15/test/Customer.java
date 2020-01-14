package day15.test;

public class Customer implements Runnable {
    private BaoZi baoZi;

    public Customer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (baoZi) {
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
//                while (true) {
                if (baoZi.getFlag() > 5) {
                    baoZi.setFlag(baoZi.getFlag() - 1);
                    System.out.println("消费线程正在消费: " + baoZi.getName() + ";价格 为: " + baoZi.getPrice() + "数量：" + baoZi.getFlag());
                        baoZi.notify();
                } else {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }


        }
    }
}

