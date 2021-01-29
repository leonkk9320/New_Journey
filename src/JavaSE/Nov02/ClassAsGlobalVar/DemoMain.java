package JavaSE.Nov02.ClassAsGlobalVar;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.setName("艾希");
        hero.setAge(20);

        Weapon weapon = new Weapon("奶");
        hero.setWeapon(weapon);
        hero.attack();
    }
}
