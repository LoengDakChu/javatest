package day15.work;

public class work9 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            int sum = 1;
            for (int i = 10; i > 0; i--) {
                sum *= i;
            }
            System.out.println(sum);
        });

        Thread t2 = new Thread(() -> {
            int sum = 1;
            for (int i = 8; i > 0; i--) {
                sum *= i;
            }
            System.out.println(sum);
        });

        Thread t3 = new Thread(() -> {
            int sum = 1;
            for (int i = 5; i > 0; i--) {
                sum *= i;
            }
            System.out.println(sum);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
