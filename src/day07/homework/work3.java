package day07.homework;

public class work3 {
    public static void main(String[] args) {
        String str="HelloWorld广州";
        System.out.println("str字符串的长度："+str.length());

        char charAt = str.charAt(2);
        System.out.println("str字符串索引为2的char值："+charAt);

        int o = str.indexOf("o");
        System.out.println("字符串o第一次出现在str字符串中的索引："+o);

        String s = str.substring(6);
        System.out.println("截取字符串str从索引6开始到结束："+s);

        String s1 = str.substring(2, 7);
        System.out.println("截取字符串str从索引6开始到结束："+s1);
    }
}
