package day03;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==3){
                break;//跳出循环,让循环提前结束
            }
            System.out.println(i);
        }
    }
}
