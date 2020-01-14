package day17.work.onePass;

import java.io.File;

public class work8 {
    public static void main(String[] args) {
        File f=new File("D:\\");
        File[] files = f.listFiles();
        for (File file:files){
            System.out.println(file);
        }
    }
}
