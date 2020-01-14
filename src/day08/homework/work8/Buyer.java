package day08.homework.work8;

public class Buyer extends AdminStaff{
    @Override
    public void work() {
        super.work();
        System.out.println("工号为："+super.getNum()+"的采购专员"+super.getName()+"在采购音响设备");
    }

    public Buyer() {
    }

    public Buyer(int num, String name) {
        super(num, name);
    }
}
