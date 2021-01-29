package JavaSE.Oct26.Demo02AbstractExample;

public class DogMain {
    public static void main(String[] args) {
        //Animal animal = new Animal(); 错！抽象类
        //Dog dog = new Dog(); 错！抽象类
        GoldenDog gd = new GoldenDog(); //可！普通类
        Dog2Ha d2 = new Dog2Ha(); //可！普通类
        gd.eat();
        gd.sleep();
        System.out.println("========");
        d2.eat();
        d2.sleep();
    }
}
