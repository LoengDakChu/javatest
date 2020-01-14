package day09.work.work6;

public class SportStudents extends Students implements Sport{
    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁 "+getName()+"的学生在打篮球");
    }

    public SportStudents() {
    }

    public SportStudents(String name, int age) {
        super(name, age);
    }
}
