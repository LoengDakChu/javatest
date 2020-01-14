package day03;

public class Continue {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            if (i%3==0){
                continue;//结束本次循环,继续下次循环  必须放在for循环或while循环中
            }
            System.out.println("报数："+i);
        }
    }
}
