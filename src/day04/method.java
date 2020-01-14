package day04;

public class method {
    public static void main(String[] args) {
        boolean bool=compare(2,2);
        System.out.println(bool);
        int sum=getsum();
        System.out.println(sum);
    }
    public static boolean compare(int a,int b){
        if (a==b){
            return true;
        }else {
            return false;
        }

    }

    public static int getsum(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        return sum;
    }
}
