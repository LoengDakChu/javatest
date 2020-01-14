package day08.homework.work7;

public class Manager extends Person {
    @Override
    public void eat() {
        System.out.println("工号为："+super.getNum()+"，姓名为："+super.getName()+"，工资为："+super.getSalary()+"的经理在吃鱼");
    }

    public void ManagerOther(){
        System.out.println("工号为："+super.getNum()+"，姓名为："+super.getName()+"，工资为："+super.getSalary()+"的经理在工作，管理其他人");
    }
    public Manager() {
    }

    public Manager(String num, String name, double salary) {
        super(num, name, salary);
    }

}
