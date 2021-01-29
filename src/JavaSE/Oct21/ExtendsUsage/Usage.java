package JavaSE.Oct21.ExtendsUsage;
/*
已用类添加新功能，创建新类继承他，添加新东西
 */
public class Usage {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=======");
        NPhone nPhone = new NPhone();
        nPhone.call();
        nPhone.send();
        nPhone.show();
    }
}
