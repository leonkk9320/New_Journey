package JavaSE.Dec02.Serializable;

import java.io.Serializable;

/*
序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
类通过实现java.io.Serializable 接口以启用序列化功能。未实现此接口的类将无法使用任何序列化或者反序列化。

Serializable是一个标记型接口（marker interface），里面什么也没有，就是告诉你这个类可以进行序列化和反序列化

transient 关键字，可以让变量不被序列化和反序列化（static 也不会，因为static在对象之前）

InvalidClassException: implements Serializable之后执行会产生序列号，Person.txt也会有同一个序列号。Person类内容改变，序列号改变，
反序列化的时候会比较类的序列号和Person.txt的序列号，不一样就会抛出InvalidClassException

解决方案：使用static final long的序列号，规定唯一序列号，无论改不改变 static final long serialVersionUID

 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
