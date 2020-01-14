package day17.test;

import java.io.File;

public class FileDemo05 {
    public static void main(String[] args) {
        File f = new File("D:\\1");

        File[] list = f.listFiles();
        if ( f!= null) {
            for (File file : list) {
                System.out.println(file);
            }
        }else {
            throw new NullPointerException("文件名或目录有误！");
        }

    }



}
