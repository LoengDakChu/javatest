package day15.work;

public class work4 {
    public static void main(String[] args) {
        Runnable r1=new Runnable(){
            @Override
            public void run() {
                while (true){

                System.out.println(Thread.currentThread().getName()+"播放背景音乐");
                }
            }
        };

        Runnable r2=new Runnable() {
            @Override
            public void run() {
                while (true){

                System.out.println(Thread.currentThread().getName()+"显示画面");
                }
            }
        };

        Thread t1=new Thread(r1,"线程一");
        Thread t2=new Thread(r2,"线程二");
        t1.start();
        t2.start();
    }
}
