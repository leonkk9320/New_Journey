package JavaSE.Oct2930.InterfacePolyCase_Laptop;
//键盘是USB
public class Keyboard implements USB{


    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void Type(){
        System.out.println("打字");
    }
}
