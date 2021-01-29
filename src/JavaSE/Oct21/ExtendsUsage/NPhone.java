package JavaSE.Oct21.ExtendsUsage;

public class NPhone extends Phone {
    @Override
    public void show() {
        super.show();//老方法里的功能

        //添加新功能
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
