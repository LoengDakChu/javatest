package day17.test;

import java.io.File;
import java.io.FileFilter;


public class FileFilterDemo01 {
    public static void main(String[] args) {
        File f = new File("D:\\LoengDakchu\\Java\\javatest\\src");
        printDir(f);
    }

    public static void printDir(File f) {
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });

//        File[] files = f.listFiles(pathname->pathname.getName().endsWith(".java")||pathname.isDirectory());
        for (File file:files){
            if (file.isFile()){
                System.out.println("文件名："+file);
            }else {
                printDir(file);
            }
        }
    }
}
