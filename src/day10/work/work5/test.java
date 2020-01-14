package day10.work.work5;



public class test {
    public static void main(String[] args) {
        Player p=new Player();
        String str1="法力角色";
        System.out.println("选择："+str1);
        p.FightAbleSelect(str1);
        System.out.println("=============");
        String str2="武力角色";
        System.out.println("选择："+str2);
        p.FightAbleSelect(str2);
    }
}
