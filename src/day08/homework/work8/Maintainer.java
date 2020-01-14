package day08.homework.work8;

public class Maintainer extends AdminStaff{
    @Override
    public void work() {
        super.work();
        System.out.println("工号为："+super.getNum()+"的维护专员"+super.getName()+"在解决不能共享屏幕问题");
    }

    public Maintainer() {
    }

    public Maintainer(int num, String name) {
        super(num, name);
    }
}
