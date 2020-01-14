package day08.homework.work2;

public class Coder extends Person {
    public Coder(String name, int age) {
        super(name, age);
    }

    public void work(){
        System.out.println(super.getName()+"敲代码");
    }
}
