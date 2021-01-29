package JavaSE.Nov02.Demo01NestedInnerClass;
/*
class 文件：
Body.class
Body$Heart.class
所以个人命名类的时候不要用$，容易混淆成内部类
 */
public class Body { //外部类
    public class Heart{ //成员内部类
        //内部类方法
        public void beat(){
            System.out.println("心脏跳动：蹦蹦蹦！");
            System.out.println("我叫： " + name); //正确方法！
        }
    }

    //外部类属性
    private String name;

    //外部类方法
    public void methodBody(){
        System.out.println("外部类方法");
        new Heart().beat();
    }
}
