package day08.homework.work8;

public class Lecturer extends Teacher {
    @Override
    public void work() {
        super.work();
        System.out.println("工号为："+super.getNum()+"的讲师"+super.getName()+"在讲课");
    }

    public Lecturer() {

    }

    public Lecturer(int num, String name) {
        super(num, name);
    }
}
