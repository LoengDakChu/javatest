package day03;

public class do_while {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        do {
            sum+=i;
            i++;
        }while (i<=100);
        System.out.println("1到100的和等于："+sum);
    }
}
