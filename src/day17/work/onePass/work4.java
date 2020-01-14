package day17.work.onePass;

import java.io.File;

public class work4 {
    public static void main(String[] args) {
        File f=new File("D:\\ccc\\bbb\\aaa");
        f.mkdirs();
        System.out.println("目录是否存在："+f.exists());
        System.out.println("目录路径："+f.getAbsolutePath());
    }
}
