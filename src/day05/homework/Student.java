package day05.homework;

public class Student {
    private String name;
    private int age;
    private String content;

    public Student(String name,int age,String content){
        this.name=name;
        this.age=age;
        this.content=content;
    }

    public void eat(){
        System.out.println("年龄为："+age+"的"+name+"正在吃饭");
    }
    public void study(){
        System.out.println("年龄为："+age+"的"+name+"正在"+content);
    }
}
