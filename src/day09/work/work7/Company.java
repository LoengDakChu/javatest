package day09.work.work7;

public class Company  extends Employee implements Money {
    private double allMoney;

    public Company(double allMoney) {
        this.allMoney = allMoney;
    }


    @Override
    public void paySalary(Employee employee) {
        System.out.println("给"+employee.getName()+"发工资 "+employee.getSalary()+"，公司剩余："+(allMoney-employee.getSalary()));
        setAllMoney(this.allMoney-employee.getSalary());
    }

    public double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }
}
