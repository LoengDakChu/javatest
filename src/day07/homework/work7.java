package day07.homework;

import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个QQ号码：");
        String s = scanner.next();
        boolean b = checkQQ(s);
        System.out.println("这个QQ号码是否正确" + b);
    }

    public static boolean checkQQ(String qq) {
        if (qq.length() < 5 || qq.length() > 12) {
            return false;
        }
        if (qq.charAt(0)== '0') {
            return false;
        }
        for (int i = 1; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
