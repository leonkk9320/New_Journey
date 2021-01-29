package JavaSE.Oct26.Demo02AbstractExample;
/*
子类只重写了一个抽象方法，父类还有一个抽象方法没写，所以子类仍是抽象类（子类要么重写全部抽象方法，要么定义为抽象类）
 */
public abstract class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("吃骨头！");
    }
}
