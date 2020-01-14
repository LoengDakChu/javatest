package day07.homework;

public class work2 {
    public static void main(String[] args) {
        //基本数据类型==是值的比较，引用数据类型==是地址值的比较，equals是指的比较
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1.startsWith("He"));
        System.out.println(str1.startsWith("abc"));
        System.out.println(str1.endsWith("o"));
        System.out.println(str1.endsWith("l"));
    }
}
