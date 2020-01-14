package day08.homework.work7;

public abstract class Person {
    private String num;
    private String name;
    private double salary;

    public abstract void eat();

    public Person() {
    }

    public Person(String num, String name, double salary) {
        this.num = num;
        this.name = name;
        this.salary = salary;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
