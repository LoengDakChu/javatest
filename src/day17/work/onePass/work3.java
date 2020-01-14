package day17.work.onePass;


import java.io.File;

public class work3 {
    public static void main(String[] args) {
        File f=new File("D:\\bbb");
        f.mkdirs();
        System.out.println("目录是否存在"+f.exists());
    }
}
