package day13.work.twopass;

import java.util.HashSet;
import java.util.Scanner;

public class work8 {
    public static void main(String[] args) {
        System.out.println("请输入多个数字");
        //创建一个HashSet 把键盘输入的数字 不重复的存进去
        HashSet<Integer> set = new HashSet<>();
        //定义一个总和
        int count=0;
        //用死循环进行 输入的数字 如果输入的数字等于-1则退出死循环
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i == -1) {
                break;
            }
            set.add(i);
        }
        //遍历set集合中的数字，并且相加。
        for (Integer a:set){
            count+=a;
        }
        System.out.println("总和："+count);
        System.out.println("平均值："+count/set.size());
    }
}
