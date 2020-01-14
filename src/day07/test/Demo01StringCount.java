package day07.test;

import java.util.Scanner;

public class Demo01StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String count = scanner.next();
        char[] array = count.toCharArray();
        int upcase = 0;
        int lowcase = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if ('A' <= c && c <= 'Z') {
                upcase++;
            } else if ('a' <= c && c <= 'z') {
                lowcase++;
            } else if ('0' <= c && c <= '9') {
                num++;
            }else {
                other++;
            }
        }
        System.out.println("大写字母个数："+upcase);
        System.out.println("小写字母个数："+lowcase);
        System.out.println("数字个数："+num);
        System.out.println("其他个数："+other);
    }
}
