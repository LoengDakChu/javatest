package day07.test;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        /*int[] arr={1,8,5,3,4,2};
        String s = Arrays.toString(arr);
        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        String str="46463241";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

//        for (int i = chars.length-1; i >=0; i--) {
//            System.out.println(chars[i]);
//        }
    }
}
