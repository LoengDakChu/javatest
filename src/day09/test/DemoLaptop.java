package day09.test;

public class DemoLaptop {
    public static void main(String[] args) {
        Laptop L=new Laptop();
        L.run();
        USB usb1=new Mouse();
        L.UseUSB(usb1);
        USB usb2=new KeyBoard();
        L.UseUSB(usb2);
        L.shutDown();
    }
}
