package day02;

public class Test8 {
    public static void main(String[] args) {
        char ch='j';
        System.out.println(ch);
        char ch2='a';
        //ch2-=32;
        ch2=(char) (ch2-32);
        System.out.println(ch2);

        double d3=33.5;
        int i3=70;
        double sum3=d3+i3;
        System.out.println("sum3的值："+sum3);
        System.out.println("sum3整数部分："+(int)sum3);

        double d4=33.5;
        int i4=70;
        int mul4=(int)(d4*i4);
        System.out.println("mul4整数部分："+mul4);
    }
}
