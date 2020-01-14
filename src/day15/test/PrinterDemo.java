package day15.test;

public class PrinterDemo {
    public static void main(String[] args) {
        Printer printer=new Printer();

        new Thread(){
            @Override
            public void run() {
                try {
                    printer.show1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    printer.show2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    printer.show3();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
