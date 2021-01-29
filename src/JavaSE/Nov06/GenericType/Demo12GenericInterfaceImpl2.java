package JavaSE.Nov06.GenericType;
/*
接口使用什么范型，实现类就是用什么范型（都是I）
相当于定义了一个含有范型的类
 */
public class Demo12GenericInterfaceImpl2<I> implements Demo10GenericInterface<I>{

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
