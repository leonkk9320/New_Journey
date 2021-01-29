package JavaSE.Nov02.Demo01NestedInnerClass;
//变量重名怎么解决： 外部类名称.this.外部类成员变量名
public class Outer {
    int num = 10; //外部类成员变量

    public class Inner{
        int num = 20; //内部类成员变量

        public void methodInner(){
            int num = 30; //内部类方法局部变量
            System.out.println(num); //30 局部变量，就近原则
            System.out.println(this.num); //20
            System.out.println(Outer.this.num); //10
        }
    }
}
