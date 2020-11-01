package JavaSE.Constructor;
/*
创建对象的方法， new就是在调用构造方法
public 类名（参数类型 参数名称）{}

注意事项：
1. 构造方法的名称和类名称一样，大小写也一样
2. 无返回值，void 都没有
3. 不能return
4. 如果没有编写任何构造方法， 编译器自己会赠送一个构造方法，没有参数，方法体什么也不做
public Student(){}
5. 一旦编写了至少一个构造方法，那么编译器不再赠送构造方法
6. 构造方法可重载

 */
public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("no param constructor implemented!");
    }
    //overload
    public Student(String s, int i){
        name = s;
        age = i;
        System.out.println("param constructor implemented!");
    }
}
