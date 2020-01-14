package day10.test;

public class test02 {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("亚索");
//        Skill skill =new Skill() {
//            @Override
//            public void use() {
//                System.out.println("无缝EEE");
//            }
//        };
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("无缝EEE");
            }
        });
        hero.attack();
    }
}
