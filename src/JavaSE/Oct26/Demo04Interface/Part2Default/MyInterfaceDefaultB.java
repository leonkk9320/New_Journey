package JavaSE.Oct26.Demo04Interface.Part2Default;

public class MyInterfaceDefaultB implements MyInterfaceDefault {

    @Override
    public void methodA() {
        System.out.println("方法实现了BBB");
    }

    public void methodAA(){
        System.out.println("重写默认方法");
    }
}
