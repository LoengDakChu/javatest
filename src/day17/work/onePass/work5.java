package day17.work.onePass;

import java.io.File;

public class work5 {
    public static void main(String[] args) {
        File f=new File("D:\\a.txt");
        System.out.println("文件是否存在"+f.exists());
        System.out.println("删除文件："+f.delete());
        File f1=new File("D:\\ccc\\bbb\\aaa");
        System.out.println("路径是否存在"+f1.exists());
        System.out.println("删除文件夹："+f1.delete());
    }
}
