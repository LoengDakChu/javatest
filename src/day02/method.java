package day02;

public class method {
    public static void main(String[] args) {
        methodDemo();
        //maxOfThree();
//        int i=1;
//        int j=2;
        sum1(1,2);
        int p=sum2(3,4);
        System.out.println(p);
    }
    public static void methodDemo(){
        System.out.println("这是一个方法");
    }
    //void 空的 没返回值
    public static void sum1(int a,int b){ //a b形式参数(形参)
        int c=a+b;
        System.out.println(c);
    }
    //int 把返回值改成int接收
    public static int sum2(int a,int b){ //a b形式参数(形参)
        int c=a+b;
        return c;
    }


    public static void maxOfThree(){
        int a=1,b=2,c=3;
        int temp = a>b ? a:b;
        int max=temp>c ? temp:c;
        System.out.println(max);
    }
}
