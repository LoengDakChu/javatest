package day17.work.onePass;

import java.io.File;
import java.io.IOException;

public class work2 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\d.txt");
        if (!f.exists()) {
            System.out.println("文件不存在");
            f.createNewFile();
            System.out.println("新建" + f.getAbsolutePath());
        } else {
            System.out.println("文件存在" + f.getAbsolutePath());
        }
    }
}
