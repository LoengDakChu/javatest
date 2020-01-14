package day13.text;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum = getSum1(arr);
        System.out.println(sum);

        int sum2 = getSum2(1, 2, 3, 4, 5, 6);
        System.out.println(sum2);
    }

    public static int getSum1(int[] arr){
        int sum=0;
        for (int n:arr){
            sum+=n;
        }
        return sum;
    }

    public static int getSum2(int... arr){
        int sum=0;
        for (int n:arr){
            sum+=n;
        }
        return sum;
    }
}
