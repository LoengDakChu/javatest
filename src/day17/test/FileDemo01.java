package day17.test;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File file=new File("D:\\b.txt");
        System.out.println("文件绝对路径："+file.getAbsolutePath());
        System.out.println("文件构造路径："+file.getPath());
        System.out.println("文件名称："+file.getName());
        System.out.println("文件长度："+file.length()+"字节");
    }
}
