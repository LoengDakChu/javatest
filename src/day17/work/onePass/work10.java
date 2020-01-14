package day17.work.onePass;

public class work10 {
    public static void main(String[] args) {
        int jieCheng = getJieCheng(10);
        System.out.println(jieCheng);
    }

    public static int getJieCheng(int n) {
        if (n<=10){
            if (n==1){
                return 1;
            }
            return n*getJieCheng(n-1);
        }else {
            return 0;
        }

    }
}
