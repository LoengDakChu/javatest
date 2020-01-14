package day17.test;

import java.io.File;

public class DiDuiDemo02 {
    public static void main(String[] args) {
        File f = new File("D:\\LoengDakchu\\Java\\javatest\\src");
        printDir(f);

    }

    public static void printDir(File f) {
        File[] files = f.listFiles();
        for (File file:files){
            if (file.isFile()){
                System.out.println("文件名"+file.getAbsolutePath());
            }else if (file.isDirectory()){
                System.out.println("目录名"+file.getAbsolutePath());
                printDir(file);
            }
        }
    }

}
