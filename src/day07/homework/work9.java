package day07.homework;

import java.util.ArrayList;

public class work9 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("泷泽萝拉");
        list.add("迪丽热巴s");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        list.add("旋风飞毛腿");
        list.add("九阴白骨爪");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String str=list.get(i);
            if (str.length()>4){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
