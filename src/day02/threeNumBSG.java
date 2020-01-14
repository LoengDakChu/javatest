package day02;

public class threeNumBSG {
    public static void main(String[] args) {
//        int num=678;
//        int b=num/100;
//        int s=num/10%10;
//        int g=num%10;
//        System.out.println("百位："+b);
//        System.out.println("十位："+s);
//        System.out.println("个位："+g);

        int num = 6789;
        int q = num / 1000;
        int b = num / 100 % 10;
        int s = num / 10 % 10;
        int g = num % 10;
        System.out.println("个位：" + q);
        System.out.println("百位：" + b);
        System.out.println("十位：" + s);
        System.out.println("个位：" + g);
    }
}
