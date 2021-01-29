package JavaSE.Oct2930.InterfacePolyCase_Laptop;
//鼠标是USB
public class Mouse implements USB{


    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void Click(){
        System.out.println("点击");
    }
}
