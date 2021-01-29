package JavaSE.Oct21.Override;
/*
重写注意事项：
1. 必须保证父子类方法名称相同，参数列表也相同
@Override: 是annotation（注解），写在子类重写method上面，可以检查该方法是否是override，如果不是则会报错
但是，这个注解可以不写，但推荐写

2. 子类方法返回值必须【小于等于】父类方法返回值范围
Object类是所有类的公共最高父类（祖宗类），java.lang.String就是Object的子类

3. 子类方法的权限必须【大于等于】父类方法权限修饰符
public > protected > (default) > private
*/
public class Demo01Override {
    public static void main(String[] args) {
        System.out.println("这是为什么呢？");
    }
}
