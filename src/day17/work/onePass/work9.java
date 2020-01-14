package day17.work.onePass;

public class work9 {
    public static void main(String[] args) {
        int sum = getSum(150);
        System.out.println(sum);
    }

    public static int getSum(int n) {
        if (n>=100&&n<=200){
            if (n==100){
                return 100;
            }

            return n+getSum(n-1);
        }else {
            return 0;
        }

    }
}
