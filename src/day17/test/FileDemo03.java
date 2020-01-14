package day17.test;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        File f1 = new File("D:\\b.txt");
        File f2 = new File("D:\\360驱动");
        // 判断是否存在
        System.out.println("D:\\b.txt 是否存在:" + f1.exists());
        System.out.println("D:\\360驱动:" + f2.exists());
        // 判断是文件还是目录
        System.out.println("d:\\aaa 文件?:" + f2.isFile());
        System.out.println("d:\\aaa 目录?:" + f2.isDirectory());
    }
}
