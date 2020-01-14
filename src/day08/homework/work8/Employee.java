package day08.homework.work8;

public abstract class Employee {
    private int num;
    private String name;

    public abstract void work();//每个员工都有工作的功能,但是具体工作内容不一样.所以定义一个抽象方法.

    public Employee() {
    }

    public Employee(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
