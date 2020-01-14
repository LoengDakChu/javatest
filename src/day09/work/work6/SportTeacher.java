package day09.work.work6;

public class SportTeacher extends Teacher implements Sport {
    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁 "+getName()+"的老师在打篮球");
    }

    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }
}
