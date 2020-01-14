package day17.test;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        // 文件的创建
//        File f1 = new File("D:\\c.txt");
//        System.out.println("判断D:\\c.txt是否存在" + f1.exists());
//        System.out.println("创建D:\\c.txt  " + f1.createNewFile());
//        System.out.println("判断D:\\c.txt是否存在" + f1.exists());
//
//        //目录的创建
//        File f2 = new File("D:\\test");
//        System.out.println("判断D:\\c.txt是否存在" + f2.exists());
//        System.out.println("创建D:\\c.txt  " + f2.mkdir());
//        System.out.println("判断D:\\c.txt是否存在" + f2.exists());

        // 创建多级目录
        File f3 = new File("D:\\test\\test01");
        System.out.println(f3.mkdir());
        File f4 = new File("D:\\test\\test01");
        System.out.println(f4.mkdirs());

        System.out.println(f4.delete());
    }
}
