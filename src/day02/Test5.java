package day02;

public class Test5 {
    public static void main(String[] args) {
        printNum();
    }
    public static void printNum(){
        float f1=12345.01f;
        float f2=12345.00f;
        double var1=f1>f2?(f2+111):(f1+0.01);
        System.out.println(var1);
        double var2=var1+1024;
        System.out.println(var2);
    }
}
