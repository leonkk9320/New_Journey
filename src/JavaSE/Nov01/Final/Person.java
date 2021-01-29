package JavaSE.Nov01.Final;
/*
对于成员变量，如果使用final关键字，那么这个变量也是不可变的

1. 由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值
2. 对于final的成员变量，要么直接赋值，要么通过构造方法赋值，二选一
3. 必须保证类当中所有的重载构造方法，最终都会对final的成员变量进行赋值
 */
public class Person {
    private final String NAME /*= "鹿晗"*/;

    public Person(String name) {
        this.NAME = name;
    }

    public Person() {
        NAME = "关晓彤";
    }

    public String getName() {
        return NAME;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
