package JavaSE.Oct2930.InterfacePolyCase_Laptop;

public class Laptop {
    public void powerOn(){
        System.out.println("开机");
    }

    public void powerOff(){
        System.out.println("关机");
    }

    // 使用USB设备的方法，使用接口作为方法参数
    public void UseDevice(USB usb){
        usb.open();
        if(usb instanceof  Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.Click();
        }else if(usb instanceof  Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.Type();
        }
        usb.close();
    }
}
