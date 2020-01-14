package day10.test;

public class Hero {
    private String name;
    private Skill skill;

    public void attack(){
        System.out.println("我叫"+name+",开始释放技能");
        skill.use();
    }

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
