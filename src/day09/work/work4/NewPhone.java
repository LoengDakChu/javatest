package day09.work.work4;

public class NewPhone extends OldPhone implements Play {
    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发短息");
    }

    @Override
    public void call() {
        System.out.println("新手机打电话");
    }
}
