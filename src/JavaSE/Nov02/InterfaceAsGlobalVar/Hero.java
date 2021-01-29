package JavaSE.Nov02.InterfaceAsGlobalVar;

public class Hero {
    private String name;
    private Skill skill; //接口作为全局变量

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Hero() {
    }

    public void attack(){
        System.out.println("我叫" + name + "， 开始释放技能： ");
        skill.use(); //调用接口中的抽象方法
        System.out.println("释放完成！");
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
