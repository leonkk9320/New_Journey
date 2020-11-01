package JavaSE.API.Anonymous;
/*
 创建对象标准格式
 类名称 对象名 = new 类名称（）；

 匿名对象就是只有右边对象，没有左边的名字和赋值运算符
 new 类名称（）；
 注意：匿名对象只能使用唯一的一次
 建议：如果有一个对象确定只使用一次，则可使用匿名对象
 */

public class Demo1 {
    public static void main(String[] args) {
       //one 是对象名字，存着对象的地址， one是引用
        Person one = new Person();
        one.name = "leon";
        one.showName("leonkk");

        //匿名对象
        new Person().name = "leonkk";
        new Person().showName("leon");// null
    }
}
