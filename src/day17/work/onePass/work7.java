package day17.work.onePass;

import java.io.File;

public class work7 {
    public static void main(String[] args) {
        File f = new File("D:\\c.txt");

        if (f.isFile()) {
            System.out.println(f.getName() + "是一个文件");
        } else {
            System.out.println(f.getName() + "不是一个文件");
        }


        File f2 = new File("D:\\有道词典");

        if (f2.isDirectory()) {
            System.out.println(f2.getName() + "是一个文件夹");
        } else {
            System.out.println(f2.getName() + "不是一个文件夹");
        }
    }
}
