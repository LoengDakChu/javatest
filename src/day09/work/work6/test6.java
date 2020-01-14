package day09.work.work6;

public class test6 {
    public static void main(String[] args) {
        Teacher t1=new Teacher("马云",45);
        SportTeacher t2=new SportTeacher("大姚",35);
        Students s1=new Students("小王",20);
        SportStudents s2=new SportStudents("王中王",21);
        goToSport(t2);
        goToSport(s2);
    }
    public static void goToSport(Sport sport){
        sport.playBasketball();
    }
}
