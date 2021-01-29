package JavaSE.Oct2930.InterfacePolyCase_Laptop;

public class DemoMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();

        //准备鼠标
        //Mouse mouse = new Mouse();
        //首先向上转型
        USB usbM = new Mouse();
        //参数是USB类型，刚好传的是USB鼠标
        laptop.UseDevice(usbM);

        //创建USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态
        //方法参数是USB，传递参数是实现类对象
        laptop.UseDevice(keyboard);//向上转型
        //laptop.UseDevice(new Keyboard());//也对

        laptop.powerOff();
    }

}
