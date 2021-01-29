package JavaSE.Nov02.Demo03AnonymousInnerClass;
/*
如果接口的实现类（或者父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

格式：
接口名称 对象名 = new 接口名称(){
    //覆盖重写所有抽象方法
    //此大括号内容代替了实现类的内容
    //直接代替了内容，没有名字，所以是匿名
};

对格式进行解析 "new 接口名称（） {...};"
1. new表示创建对象的动作
2. 接口名称就是匿名内部类需要实现哪个接口
3. {...}才是匿名内部类的内容

另外还要注意几点问题：
1. 匿名内部类，在【创建对象】的时候，只能使用唯一一次。
如果想多次创建对象，而且内容一样的话，就只能单独定义实现类了(只有一个对象可用)
2. 匿名对象是在【调用方法】的时候使用唯一一次
3. 匿名内部类省略了【实现类/子类名称】，但是匿名对象则是省略了【对象名称】
 */
public class DemoMain {
    public static void main(String[] args) {
//        Myinterface impl = new MyinterfaceImpl();
//        impl.method();

        //省略实现类，直接使用匿名内部类
        //但不是匿名对象，对象名称叫obj
        Myinterface obj = new Myinterface(){
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法！aaa");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法!2 aaa");
            }
        };
        obj.method();
        obj.method2();
        //Myinterface obj2 = new Myinterface() 不可！接口不可实例化！要不再写一边匿名内部类，要不然写实现类

        System.out.println("=========");

        //使用匿名对象调用匿名内部类
        new Myinterface(){
            @Override
            public void method() {
                System.out.println("匿名对象调用匿名内部类实现了方法！bbb");
            }

            @Override
            public void method2() {
                System.out.println("匿名对象调用匿名内部类实现了方法!2 bbb");
            }
        }.method();

        new Myinterface(){
            @Override
            public void method() {
                System.out.println("匿名对象调用匿名内部类实现了方法！bbb");
            }

            @Override
            public void method2() {
                System.out.println("匿名对象调用匿名内部类实现了方法!2 bbb");
            }
        }.method2();


    }

}
