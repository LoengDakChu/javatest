package day09.test;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("插入鼠标");
    }

    @Override
    public void close() {
        System.out.println("拔出鼠标");
    }

    public void click(){
        System.out.println("鼠标单机");
    }
}
