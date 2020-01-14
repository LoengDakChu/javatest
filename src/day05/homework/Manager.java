package day05.homework;

public class Manager {
    private String name;
    private int num;
    private double salary;
    private double bonus;

    public void intro(){
        System.out.println("经理名字："+name);
        System.out.println("工号："+num);
    }
    public void showSalary(){
        System.out.println("基本工资为"+salary+",奖金为"+bonus);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
