package day15.test;

public class DemoShow {
    public static void main(String[] args) {
        Shower shower=new Shower();

        new Thread(){
            @Override
            public void run() {
                try {
                    shower.show1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    shower.show2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
