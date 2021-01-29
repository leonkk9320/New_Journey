package JavaSE.Nov03.Demo01ObjectClass;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    /*
    直接打印对象的地址值是没有意义的，需要重写Object类的toString 方法
    打印对象的属性（name, age）
     */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    Object类的equals方法默认比较的是两个对象的地址值，没有意义
    所以我们要重写equals方法，比较两个对象的属性值（name，age）
    问题：
        隐含多态
        Object obj = p2 = new Person("古力娜扎",18);
        多态弊端：无法使用子类的特有内容（属性（编译看左边，执行看左边），方法（编译看左边，执行看右边））
        解决：可以使用向下转型（强转），把Object类转为Person
     */

//    @Override
//    public  boolean equals(Object obj){
//        //提高效率
//        if(obj == this){
//            return true;
//        }
//
//        if(obj == null){
//            return false;
//            //this 是 null 直接空指针异常
//        }
//
//
//        //增加判断，是Person类型在转换，防止类型转换异常ClassCastException
//        if(obj instanceof Person){
//            Person p = (Person)obj;
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//        //不是Person类直接表示错误
//        return false;
//    }

    //command N --> equals & hashCode --> java7+


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//反射
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);//Objects工具类
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
}
