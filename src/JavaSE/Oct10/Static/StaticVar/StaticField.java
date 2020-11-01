package JavaSE.Oct10.Static.StaticVar;

/*
成员变量使用static， 那么这个变量不在属于对象自己，而是属于所在类。多个对象共享一份数据。

 */
public class StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student("Aguero", 32);

        Student.room = "room101";

        System.out.println("name: " + stu1.getName() + " age: "
                + stu1.getAge() + " room: " + stu1.room + " id: " + stu1.getId());

        Student stu2 = new Student("Leon", 23);
        System.out.println("name: " + stu2.getName() + " age: "
                + stu2.getAge() + " room: " + stu2.room + " id: " + stu2.getId());
    }
}
/*
stu1, stu2在栈中，
new Student("Aguero", 32)， new Student("Leon", 23) 在堆中
方法区（.class 信息）中有静态区（room 的值 "room101"）， 类名.变量名 直接访问方法区，再访问静态区，不访问堆
 */