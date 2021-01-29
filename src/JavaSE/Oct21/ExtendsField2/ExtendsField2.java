package JavaSE.Oct21.ExtendsField2;
/*
以下三者重名：
局部变量： 直接写
本类的成员变量： this.成员变量名
父类的成员变量：super.成员变量名
 */
public class ExtendsField2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
        System.out.println("========");

    }
}
