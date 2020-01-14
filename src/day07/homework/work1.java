package day07.homework;

public class work1 {
    public static void main(String[] args) {
        String str1=new String();
        str1="你好";
        System.out.println(str1);

        char[] chars={'h','e','l','l','o'};
        String str2=new String(chars);
        System.out.println(str2);

        byte[] bytes={97,98,99,100,101};
        String str3=new String(bytes);
        System.out.println(str3);
    }
}
