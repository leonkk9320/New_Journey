package JavaSE.Nov06.GenericType;
/*
    定义一个含有范型的类，模拟ArrayList集合
    范型是一个未知的数据类型，当我们不确定用什么数据类型的时候，可以使用范型
    范型可以接收任意数据类型
    【创建对象的时候确定范型类型】
 */
public class Demo06GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
