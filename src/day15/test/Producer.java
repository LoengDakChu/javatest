package day15.test;

public class Producer implements Runnable {
    private BaoZi baoZi;

    public Producer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        Integer index = 0;
        while (true) {
            synchronized (baoZi) {
/*                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
//                while (true) {
                    if (baoZi.getFlag() < 10) {
                        if (index % 3 == 0) {
                            baoZi.setName("菜包");
                            baoZi.setPrice(1.0);
                        } else if (index % 3 == 1) {
                            baoZi.setName("肉包");
                            baoZi.setPrice(1.5);
                        } else {
                            baoZi.setName("流沙包");
                            baoZi.setPrice(3.0);
                        }
                        baoZi.setFlag(baoZi.getFlag() + 1);
                        System.out.println("生产线程正在生产: " + baoZi.getName() + ";价格 为: " + baoZi.getPrice() + "数量：" + baoZi.getFlag());
                        index++;
                        baoZi.notify();
                    }
                    else {
                        try {
                            baoZi.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

//                }

            }
        }
    }
}