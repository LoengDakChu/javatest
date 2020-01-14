package day08.homework.work2;

public class work2 {
    public static void main(String[] args) {
        Coder coder=new Coder("马化腾",45);
        Teacher teacher=new Teacher("马云",60);
        coder.eat();
        coder.sleep();
        coder.work();
        System.out.println("================");
        teacher.eat();
        teacher.sleep();
        teacher.teach();

    }
}
