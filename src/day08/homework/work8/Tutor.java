package day08.homework.work8;

public class Tutor  extends Teacher{
    @Override
    public void work() {
        super.work();
        System.out.println("工号为："+super.getNum()+"的助教"+super.getName()+"在帮助学生解决问题");
    }

    public Tutor() {
    }

    public Tutor(int num, String name) {
        super(num, name);
    }
}
