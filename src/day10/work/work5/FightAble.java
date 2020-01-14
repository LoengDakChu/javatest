package day10.work.work5;

public interface FightAble {
    void specialFight();
    default void commonFitht(){
        System.out.println("普通打击");
    }
}
