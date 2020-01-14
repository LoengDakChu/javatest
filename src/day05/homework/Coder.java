package day05.homework;

public class Coder {
    private String name;
    private int num;
    private double salary;

    public Coder(String name,int num,double salary){
        this.name=name;
        this.num=num;
        this.salary=salary;
    }

    public void intro(){
        System.out.println("程序猿："+name);
        System.out.println("工号："+num);
    }
    public void showSalary(){
        System.out.println("基本工资为"+salary+",奖金无");
    }
    public void work(){
        System.out.println("正在努力写着代码...");
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
}
