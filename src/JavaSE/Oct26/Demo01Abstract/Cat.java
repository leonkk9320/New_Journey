package JavaSE.Oct26.Demo01Abstract;

public class Cat extends Animal {
    public Cat(){
        super(10);//子类构造方法前必须要有父类构造方法
    }
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
