package day04;

public class arrFor {
    public static void main(String[] args) {
        //数组遍历
        int[] arr=new int[]{1,2,3,4,5};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-----------------");

        //数组中最大值
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        System.out.println("-----------------");

        //数组反转
        for (int i = 0,j=arr.length-1; i <j ; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //
    }
}
