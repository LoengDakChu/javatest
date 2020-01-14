package day04;

public class arrAddress {
    public static void main(String[] args) {
//        int[] arr1=new int[2];
//        int[] arr2=new int[3];
//        System.out.println(arr1);
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr2);
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//
//        arr1[0]=100;
//        arr2[0]=200;
//        System.out.println("---------------");
//
//        System.out.println(arr1);
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);

        int[] arr1={100,200,300};
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        int[] arr2=arr1;
        arr2[0]=111;
        arr2[1]=222;
        arr2[2]=333;
        System.out.println("‐‐‐‐‐‐‐‐‐");
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
