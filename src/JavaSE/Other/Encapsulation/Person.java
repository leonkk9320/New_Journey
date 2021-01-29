package JavaSE.Other.Encapsulation;
/*
问题： age 无法组织不合理数值
解决： 加private

一旦使用private修饰，本类可访问，但是超出了范围之外就不能访问了
使用getter setter
布尔值： setXXX（setter） isXXX（getter）
 */
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫 " + name + ", 年龄 " + age);
    }

    public void setAge(int num){
        if(num < 100 && num >= 0){
            age = num;
        }
        else{
            System.out.println("不合理");
        }
    }

    public int getAge(){
        return age;
    }

}
