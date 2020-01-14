package day15.work;

public class work1andwork2 {
    public static void main(String[] args) {
        /*1.请描述Thread类中的start()方法和run()方法的区别
        * run()方法的方法体代表了线程需要完成的任务，是线程执行体
        * start()方法是开启线程，所有线程都要创建线程对象然后调用start()方法开启线程
        *
        * 2.创建线程
        * 继承Thread类方式：
        * 定义Thread类子类，重写run()方法
        * 创建Thread子类的实例，即创建对象
        * 调用start()方法开启该线程
        *
        * 实现Runnable接口方式：
        * 定义Runnable接口实现类，重写run()方法
        * 创建实现类对象
        * 创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对
        * 象才是真正的线程对象。
        * 调用线程对象的start()方法来启动线程。*/
    }
}
