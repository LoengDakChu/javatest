package day07.homework;

public class work4 {
    public static void main(String[] args) {
        String str="HelloWorld";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        String tolowerCase = str.toLowerCase();
        System.out.println("将str字符串转换为小写："+tolowerCase);

        String toUpperCase = str.toUpperCase();
        System.out.println("将str字符串转换为大写："+toUpperCase);

        String replace = str.replace('o', '6');
        System.out.println("将str字符串中的字符'o'替换成'6'："+replace);

        String replace1 = str.replace("ll", "LL");
        System.out.println("将str字符串中的字符串ll替换成LL："+replace1);
    }
}
