package day09.test;

public class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("插入键盘");
    }

    @Override
    public void close() {
        System.out.println("拔出键盘");
    }
    public void type(){
        System.out.println("键盘打字");
    }
}
