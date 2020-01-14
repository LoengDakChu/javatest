package day08.homework.work5;

public class Student extends Person {
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void exam(){
        System.out.println(super.getName()+"同学，考试考得了："+this.score+"分");
    }

    public void setScore(int score) {
        this.score = score;
    }
}
