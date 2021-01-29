package JavaSE.Nov03.Demo01ObjectClass;

/*
        Person 类默认继承了Object类，所以可以使用Object类的equals的方法
        boolean equals(Object obj) 指示其他某个对象是否与此对象"相等"。
        重写参数对象范围比Obj小
         */
public class Demo02ObjectClassEquals {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("古力娜扎",18);

        boolean b = p1.equals(p2);
        System.out.println(b);

    }
}

/*
源码：【两个对象的地址值的比较】
public boolean equals(Object obj) {
        return (this == obj);
    }
参数：Object obj:可以传递任意对象
方法体：
==：比较运算符
基本数据类型：比较的是值
引用数据类型：比较的是两个对象的地址值
this是谁？谁调用这个方法，谁就是this 此处为p1，obj是p2
this == obj  -->  p1 == p2
 */
