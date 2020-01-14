package day09.work.work4;

public class test4 {
    public static void main(String[] args) {
        OldPhone old=new OldPhone();
        old.call();
        old.sendMessage();
        NewPhone newPhone=new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();
    }
}
