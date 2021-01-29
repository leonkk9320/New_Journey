package JavaSE.Dec18.Reflection;//包名

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
三种获取类对象的方式：
Class.forName("包名+类名")
    多用于配置文件：类名定义在配置文件中。读取文件，加载类
类名.class 类名的属性class获取
    最安全可靠，多用于传递参数
对象.getClass() Object 类中定义的方法

Class对象的功能：Class 对象可以获取 Filed对象， Constructor对象 Method对象 String类名
获取功能：成员变量Field[] 构造方法Constructor[] 成员方法Method[] 类名String
    getXXX getDeclaredXXX

成员变量 set get
构造方法 constructor.newInstance()
成员方法 invoke()
getName(): 获取方法名或者类名

注意：
带declared进行访问（修改），setAccessible(true)
 */
public class Demo06Reflection {
    public static void main(String[] args) throws Exception {
        //获取类对象
        Class c1 = Class.forName("JavaSE.Dec18.Reflection.Person");
        System.out.println(c1);

        Class c2 = Person.class;
        System.out.println(c2);

        Person p = new Person();
        Class c3 = p.getClass();
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3); // 这仨都是同一个类对象，说明了一个类的类对象有且只有一个

        System.out.println("============");
        System.out.println("============");

        //获取功能
        //成员变量
        Field[] f1 = c1.getFields(); //only public
        for (Field field : f1) { //f1.for
            System.out.println(field);
        }
        Field[] f2 = c1.getDeclaredFields(); //all var
        for (Field field : f2) { //f1.for
            System.out.println(field);
        }

        //对成员变量进行获取与赋值
        Field a = c1.getField("age");
        a.set(p,23);
        System.out.println(p);

        Field n = c1.getDeclaredField("name");//通过getDeclaredField()获取私有
        //忽略访问权限修饰符的安全检查
        n.setAccessible(true); //可access， 【暴力反射】！！
        Object value = n.get(p); //反射 变量.方法(对象)
        System.out.println(value);

        System.out.println("============");

        //构造器
        Constructor constructor = c2.getConstructor(int.class, String.class);//带参数的构造方法，当然也可以留空，那么返回的就是空参构造方法
        System.out.println(constructor);
        Object person = constructor.newInstance(24,"zhang");//创建instance的新方法！！！
        System.out.println(person);

        System.out.println("============");

        //方法
        Method eat_method = c3.getMethod("eat");//获取方法对象, 传递方法名
        Person person1 = new Person();
        eat_method.invoke(person1); //方法对象.invoke(实例对象) 参数必须有实例对象

        Method eat_method2 = c3.getMethod("eat", String.class);// 传递方法名+参数类对象
        eat_method2.invoke(p,"饭"); //参数：实例对象+参数

        System.out.println("============");

        String s1 = eat_method.getName();
        String s2 = eat_method2.getName();
        String s3 = c3.getName();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
