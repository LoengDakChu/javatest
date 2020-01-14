package day17.test;

public class DiGui {
    public static void main(String[] args) {
        int a=5;
        int sum = getSum(a);
        System.out.println(sum);

        int b=getb(10);
        System.out.println(b);
    }

    public static int getb(int i) {
        if (i==1){
            return 1;
        }
        return i*getb(i-1);
    }

    public static int getSum(int n){
        if (n==1){
            return 1;
        }
        return n+getSum(n-1);
    }
}
