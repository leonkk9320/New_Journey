package JavaSE.Nov03.Demo01ObjectClass;

/*
java.lang.Object
Object类是类层次结构的根（最顶层）类。每个类都使用Object作为父类
所有对象（包括数组）都实现这个类的方法
 */
public class Demo01ObjectClassToString {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类，所以可以使用Object类中的toString方法
        String toString() 返回该对象的字符串表示
         */
        Person person = new Person("张三", 18);
        String s = person.toString();
        System.out.println(s);//JavaSE.Nov03.ObjectClass.Person@6e0be858 重写后：Person{name='张三', age=18}

        //直接打印对象的名字，其实就是调用对象的toString方法
        System.out.println(person);//JavaSE.Nov03.ObjectClass.Person@6e0be858 重写后：Person{name='张三', age=18}

        //看一个类是否重写了toString方法，直接打印对象名即可
        //没有重写，打印地址值
        //重写了，那么就按照重写的方法打印
    }
}
