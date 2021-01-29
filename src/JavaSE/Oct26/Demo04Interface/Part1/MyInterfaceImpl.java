package JavaSE.Oct26.Demo04Interface.Part1;

import JavaSE.Oct26.Demo04Interface.Part1.MyInterfaceAbstract;

public class MyInterfaceImpl implements MyInterfaceAbstract {

    @Override
    public void m1() {
        System.out.println("第1个方法");
    }

    @Override
    public void m2() {
        System.out.println("第2个方法");
    }

    @Override
    public void m3() {
        System.out.println("第3个方法");
    }

    @Override
    public void m4() {
        System.out.println("第4个方法");
    }
}
