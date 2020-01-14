package day17.work.twoPass;

import java.io.File;
import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        String path = new Scanner(System.in).next();
        File f=new File(path);
        if (f.isFile()){
            System.out.println(f.length());
        }else {
            int num=0;
            File[] files = f.listFiles();
            for (File file:files){
                num+=file.length();
            }
            System.out.println("大小："+num);
        }
    }
}
