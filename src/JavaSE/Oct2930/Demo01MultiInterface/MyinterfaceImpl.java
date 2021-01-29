package JavaSE.Oct2930.Demo01MultiInterface;

public class MyinterfaceImpl implements MyinterfaceA, MyinterfaceB {
    @Override
    public void methodA() {
        System.out.println("AAA");
    }

    @Override
    public void methodCommon() {
        System.out.println("A, B接口中共同抽象方法只用重写一遍");
    }

    @Override
    public void methodDefault() {
        System.out.println("冲突默认方法（相同方法：名字，返回值，参数， 内容不同，" +
                "即两默认方法为重写关系）必须在实现类重写");
    }

    @Override
    public void methodB() {
        System.out.println("BBB");
    }
}
