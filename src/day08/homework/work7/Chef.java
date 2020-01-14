package day08.homework.work7;

public class Chef extends Person{
    @Override
    public void eat() {
        System.out.println("工号为："+super.getNum()+"，姓名为："+super.getName()+"，工资为："+super.getSalary()+"的厨师在吃肉");
    }
    public void cooking(){
        System.out.println("工号为："+super.getNum()+"，姓名为："+super.getName()+"，工资为："+super.getSalary()+"的厨师在工作，炒菜");
    }

    public Chef() {
    }

    public Chef(String num, String name, double salary) {
        super(num, name, salary);
    }
}
