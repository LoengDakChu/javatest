package day06.test;

import java.util.Random;
import java.util.Scanner;

public class randomGame {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int num = random.nextInt(101);
        System.out.println("请输出");
        while (true){
            int n = scanner.nextInt();
            if (num>n){
                System.out.println("猜小了");
            }else if (num<n){
                System.out.println("猜大了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
