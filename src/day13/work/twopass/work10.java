package day13.work.twopass;

import java.util.HashSet;
import java.util.Iterator;

public class work10 {
    public static void main(String[] args) {
        HashSet<Students> hashSet = new HashSet<>();
        hashSet.add(new Students("马云", 18, 100));
        hashSet.add(new Students("大云", 19, 90));
        hashSet.add(new Students("小云", 23, 96));
        hashSet.add(new Students("中云", 35, 98));
        hashSet.add(new Students("马云", 18, 100));
        Iterator<Students> it = hashSet.iterator();
        Students s = it.next();
        Students max = s;
        Students min = s;
        int all = 0;
        for (Students a : hashSet) {
            all+=a.getScore();
            if (a.getScore() > max.getScore()) {
                max = a;
            }
            if (a.getScore()<min.getScore()){
                min=a;
            }
        }
        System.out.println("总分："+all);
        System.out.println("平均分："+all/hashSet.size());
        System.out.println("最高分："+"姓名"+max.getName()+"，分数："+max.getScore());
        System.out.println("最低分："+"姓名"+min.getName()+"，分数："+min.getScore());


    }
}
