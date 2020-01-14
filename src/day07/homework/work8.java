package day07.homework;

public class work8 {
    public static void main(String[] args) {
        String str = "javajfiewjavajfiowfjavagkljjava";
        int count = getCount(str, "java");
        System.out.println(count);
    }
    public static int getCount(String str,String ch){
        int count=0;
        while (str.indexOf(ch)!=-1){
            int index=str.indexOf(ch);
            str = str.substring(index+ch.length());
            count++;
            System.out.println(str);
        }
        return count;
    }
}
