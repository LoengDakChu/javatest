package day05.homework;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public void eat(){
        System.out.println("年龄为："+age+"的"+name+"正在吃饭");
    }
    public void teach(){
        System.out.println("年龄为："+age+"的"+name+"正在"+content);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getContent(){
        return this.content;
    }
}
