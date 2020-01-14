package day05.homework;

public class test2 {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.setName("周老师");
        t.setAge(30);
        t.eat();
        t.setContent("亢奋的讲着java面向对象的知识....");
        t.teach();
        Student s=new Student("韩同学",18,"专心致志的听着java面向对象的知识....");
        s.eat();
        s.study();
    }
}
