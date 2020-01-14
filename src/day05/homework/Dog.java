package day05.homework;

public class Dog {
    private String name;
    private int age;

    public Dog(){

    }
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
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
    public void shouMsg(){
        System.out.println("狗狗的名字："+name+"年龄："+age);
    }
}
