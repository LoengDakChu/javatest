package day07.test;

public class string {
    public static void main(String[] args) {
        //[word1#word2#word3]
        int[] array={1,2,3};
        String s = newarray(array);
        System.out.println(s);
    }
    public static String newarray(int[] arr){
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                str+="word"+arr[i]+"]";
            }else {
                str=str+"word"+arr[i]+"#";
            }
        }
        return str;
    }
}
