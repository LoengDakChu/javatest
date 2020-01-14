package day14.work.onePass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class work7 {
    public static void main(String[] args) {
        HashMap<Student,String> map=new HashMap<>();
        map.put(new Student("小亮",18),"广东");
        map.put(new Student("小红",18),"湖南");
        map.put(new Student("小强",18),"湖北");

        Set<Student> students = map.keySet();

        for (Student key:students){
            String value = map.get(key);
            System.out.println(key+"："+value);
        }

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> s:entries){
            Student key = s.getKey();
            String value = s.getValue();
            System.out.println(key+"："+value);
        }
    }
}
