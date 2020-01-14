package day07.test;

public class Demo01Math {
    public static void main(String[] args) {
        int n=0;
        for (double i = -10.8; i <=5.9 ; i++) {
            if (Math.abs(i)>6||Math.abs(i)<2.1){
                n++;
            }
        }
        System.out.println(n);
    }
}
