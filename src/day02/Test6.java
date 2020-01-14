package day02;

public class Test6 {
    public static void main(String[] args) {
        printString();
    }
    public static void printString(){
        int num=30;
        String str=(num%2==0)?("偶数"):("基数");
        System.out.println("num:"+num+"是"+str);
    }
}
