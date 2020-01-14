package day07.test;

public class Demo03StringSplit {
    public static void main(String[] args) {
        String str="User{name='马云'，age=21，money=1500}";
        String substring = str.substring(5, str.length() - 1);//截取name='马云'，age=21，money=1500
        String replace = substring.replace("'", "");//把name='马云'，age=21，money=1500中有'的换成""；
        String[] split = replace.split("，");
        String[] result=new String[3];
        for (int i = 0; i < split.length; i++) {
            String str1=split[i];
            System.out.println(str1);
            String[] split1 = str1.split("=");
            result[i]=split1[1];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
