package day10.work.work5;

public class Player {
    public void FightAbleSelect(String str) {
        if ("法力角色".equals(str)) {
            ZhanShi zs=new ZhanShi();
            zs.specialFight();
            zs.commonFitht();
        }else if ("武力角色".equals(str)){
            FaShi fs=new FaShi();
            fs.specialFight();
            fs.commonFitht();
        }
    }
}
