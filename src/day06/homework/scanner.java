package day06.homework;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数");
        int c = scanner.nextInt();

        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("最大值为："+max);

    }
}
