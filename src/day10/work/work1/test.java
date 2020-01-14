package day10.work.work1;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s = "23.23456789";
        System.out.println("原数字：" + s);
        new HandleAble() {
            @Override
            public void HandleString(String num) {
                String[] split = num.split("\\.");//将字符串以.分割成长度为2的数组
                String s1 = split[0];//将小数点之前的整数给s1
                String s2 = split[1];//将小数点之后的数给s2
                String s3 = s2.substring(0, 4);//截取s2的前四个数
                char[] chars = s3.toCharArray();//把截取出来的四个数变成字符数组
                //如果第四位字符大于字符5，那么它就+1   四舍五入
                if (chars[3] >= '5') {
                    chars[3]+=1;
                }
                String s4=new String(chars);
                System.out.println("取整后：" + s1);
                System.out.println("取整后：" + s1 + "." + s4);
            }
        }.HandleString(s);
    }
}
