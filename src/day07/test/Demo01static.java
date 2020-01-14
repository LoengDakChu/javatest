package day07.test;

public class Demo01static {
    private static int countid=0;
    String name;
    private int id;
    private int age;

    public Demo01static(){
        this.id=++countid;
    }
    public Demo01static(String name) {
        this.name = name;
        this.id=++countid;
    }
    public static void show(){

    }

    public static void main(String[] args) {
        Demo01static d1=new Demo01static("小小");
        Demo01static d2=new Demo01static("小小");
        System.out.println(d1.name+d1.id+d1.age);
        System.out.println(d2.name+d2.id);
    }
}
