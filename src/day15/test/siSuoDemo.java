package day15.test;

public class siSuoDemo {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s1) {
                        System.out.println(this.getName() + "，s1");
                        synchronized (s2) {
                            System.out.println(this.getName() + "，s2");
                        }
                    }
                }

            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s2) {
                        System.out.println(this.getName() + "，s3");
                        synchronized (s1) {
                            System.out.println(this.getName() + "，s4");
                        }
                    }
                }

            }
        }.start();
    }
}
