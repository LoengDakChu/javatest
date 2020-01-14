package day06.test;

import java.util.Scanner;
public class text0 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i=scanner.nextInt();
        System.out.println("请输入一个整数：");
        int j=scanner.nextInt();
        System.out.println("请输入一个整数：");
        int k=scanner.nextInt();

        int temp=i>j?i:j;
        int max=temp>k?temp:k;
        System.out.println("最大值："+max);
    }
}
