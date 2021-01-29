package JavaSE.Nov02.InterfaceAsGlobalVar;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        hero.setSkill(new SkillImpl());
        hero.attack();

        System.out.println("===========");

        //匿名内部类写法
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("pia~pia~pia");
            }
        };
        hero.setSkill(skill);
        hero.attack();

        System.out.println("===========");

        //匿名对象的匿名内部类写法
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu~pia~pia~pia");
            }
        });
        hero.attack();


    }
}
