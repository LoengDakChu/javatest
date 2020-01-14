package day17.work.onePass;

import java.io.File;

public class work1 {
    public static void main(String[] args) {
        File f1=new File("D:\\c.txt");
        File f2=new File("src\\day17\\onePass","c.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());


    }
}
