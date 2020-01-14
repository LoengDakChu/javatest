package day10.test;

public class Start  {
     private Task task1;

    public Start(Task task1) {
        this.task1 = task1;
    }

    public void run(){
        task1.task();
    }
}
