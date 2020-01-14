package day02;

public class Test7 {
    public static void main(String[] args) {
        int a=10;
        int b=7;
        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
        remain(a,b);
    }
    public static void add(int a,int b){
        int c=a+b;
        System.out.println("a+b等于"+c);
    }
    public static void sub(int a,int b){
        int c=a-b;
        System.out.println("a-b等于"+c);
    }
    public static void mul(int a,int b){
        int c=a*b;
        System.out.println("a*b等于"+c);
    }
    public static void div(int a,int b){
        int c=a/b;
        System.out.println("a/b等于"+c);
    }
    public static void remain(int a,int b){
        int c=a%b;
        System.out.println("a%b等于"+c);
    }
}
