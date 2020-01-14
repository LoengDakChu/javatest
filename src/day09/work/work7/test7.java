package day09.work.work7;

public class test7 {
    public static void main(String[] args) {
     Company company=new Company(1000000);
     Manager manager=new Manager("张小强",9000.0);
     Coder coder=new Coder("李晓亮",5000.0);
     company.paySalary(manager);
     company.paySalary(coder);
    }
}
