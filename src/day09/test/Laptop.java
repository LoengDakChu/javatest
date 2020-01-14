package day09.test;

public class Laptop {
    public void run(){
        System.out.println("电脑运行~");
    }
    public void UseUSB(USB usb){
        usb.open();
        if (usb instanceof Mouse){
            Mouse m=(Mouse) usb;
            m.click();
        }else if (usb instanceof KeyBoard){
            KeyBoard kb=(KeyBoard) usb;
            kb.type();
        }
        usb.close();
    }
    public void shutDown(){
        System.out.println("电脑关机");
    }
}
