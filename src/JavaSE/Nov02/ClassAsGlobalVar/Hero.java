package JavaSE.Nov02.ClassAsGlobalVar;

public class Hero {
    private String name; //英雄名字
    private int age; //英雄年龄
    private Weapon weapon; //武器

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public Hero() {
    }

    public void attack(){
        System.out.println("年龄为" + this.age + "的" + name + "用" + weapon.getCode() + "攻击敌方。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
