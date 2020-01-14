package day12.work.SecondPass;

import java.util.ArrayList;
import java.util.Iterator;

public class work1 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("小王",18,98));
        list.add(new Student("龙啸",15,91));
        list.add(new Student("咆哮",17,80));
        list.add(new Student("火影",19,90));
        list.add(new Student("小炮",14,100));
        Iterator<Student> it = list.iterator();
        double all=0;
        double max=list.get(0).getScore();
        double min=list.get(0).getScore();
        double avg;
        while (it.hasNext()){
            Student student = it.next();
            all+=student.getScore();
            if (student.getScore()>max){
                max=student.getScore();
            }
            if (student.getScore()<min){
                min=student.getScore();
            }
        }
        avg=all/list.size();
        System.out.println("总分："+all);
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
        System.out.println("平均分："+avg);
    }
}
