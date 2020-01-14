package day03;

public class For {
    public static void main(String[] args) {
//        for (int i=0;i<10;i++){
//            System.out.println("我要变强！");
//        }
//        for (int y=97;y<123;y++){
//            System.out.println((char)y);
//        }
//        int sum=0;
//        for (int i=1;i<=5;i++){
//            sum+=i;
//        }
 //       System.out.println("1-5的和："+sum);
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println("1到100的偶数和等于"+sum);
    }
}
