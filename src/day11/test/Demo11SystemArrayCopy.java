package day11.test;

public class Demo11SystemArrayCopy {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};
        System.arraycopy(arr1,1,arr2,0,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


    }
}
