package day10.Lambda;

public class test1 {
    public static void main(String[] args) {
//        invokeCalc(1, 2, new Calculator() {
//            @Override
//            public int clac(int a, int b) {
//                return a+b;
//            }
//        });

        invokeCalc(1,2,(int a,int b)->{
            return a+b;
        });
    }
    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.clac(a, b);
        System.out.println(sum);
    }
}
