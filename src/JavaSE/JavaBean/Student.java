package JavaSE.JavaBean;
/*
1. 成员变量要 private
2. 每一个成员变量都要有getter setter
3. 编写无参构造方法
4. 编写有参构造方法

这样的标准类叫做java bean
 */
public class Student {
    private String name;
    private int age;

    //code -> generate -> Constructor -> shift + select variable
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //code -> generate -> Constructor -> select none
    public Student() {
    }

    //code -> generate -> Getter and Setter -> shift + select variable
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
