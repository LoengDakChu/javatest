package day17.work.onePass;

import java.io.File;

public class work6 {
    public static void main(String[] args) {
        File f=new File("D:\\LoengDakchu\\idea快捷键.txt");
        System.out.println("文件名："+f.getName());
        System.out.println("文件大小："+f.length());
        System.out.println("文件路径："+f.getAbsolutePath());
        System.out.println("文件父路径："+f.getParent());
    }
}
