package day11.work;

public class work2_2 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        String str1="";
        for (int i = 1; i <=1000 ; i++) {
            str1+=i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

        long start = System.currentTimeMillis();
        StringBuilder str=new StringBuilder();
        for (int i = 1; i <=1000 ; i++) {
            str.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
