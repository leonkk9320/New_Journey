package JavaSE.This;
/*
当方法的局部变量和类的成员变量重名时，根据"就近原则"，优先使用局部变量
如果需要访问本类当中的成员变量，需要使用格式：
this.成员变量名
 */
public class Demoperson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Leon";
        person.sayHi("papa");
        System.out.println(person);//地址值与this 相同
    }
}
