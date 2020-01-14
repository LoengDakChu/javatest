package day17.work.twoPass;

import day10.work.work5.FaShi;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class work1 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入路径：");
        String path = new Scanner(System.in).next();
        File f = new File(path);
        if (f.isFile()) {
            System.out.println("文件名：" + f.getName() + "大小：" + f.length());
        } else {
            System.out.println("文件不存在");
            System.out.println("创建文件"+f.createNewFile());
            System.out.println(f.getName()+"大小："+f.length());
        }
    }
}
