package day07.homework;

import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        String replace= str.replace("你大爷的", "****");
        System.out.println(replace);
    }
}
