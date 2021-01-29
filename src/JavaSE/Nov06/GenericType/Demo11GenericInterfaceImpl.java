package JavaSE.Nov06.GenericType;
/*
含有范型的接口，第一种使用方式： 定义接口的实现类，实现接口，指定接口的范型
例子：
    public interface Iterator<E>{
        E next();
    }
    Scanner类实现了Iterator接口，并指定接口的范型为String，所以重写的next方法范型默认就是String
    public final class Scanner implements Iterator<String>{
        public String next(){}
    }
 */
public class Demo11GenericInterfaceImpl implements Demo10GenericInterface<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
