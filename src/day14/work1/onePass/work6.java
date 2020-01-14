package day14.work1.onePass;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class work6 {
    public static void main(String[] args) {
        HashMap<String,Student> map=new HashMap<>();
        map.put("广东",new Student("小亮",18));
        map.put("湖南",new Student("小红",18));
        map.put("湖北",new Student("小强",18));

        //ketSet
        Set<String> set = map.keySet();
        set.stream().forEach(key -> {
            Student value = map.get(key);
            System.out.println("省份"+key+"学生："+value);
        });

        System.out.println("=============");
        //entrySet
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        entries.stream().forEach(a->{
            String key = a.getKey();
            Student value = a.getValue();
            System.out.println("省份"+key+"学生："+value);
        });
    }
}
