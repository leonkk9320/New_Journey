package JavaSE.Dec14.ReviewOnLambda;
/*
    只能有一个抽象方法的接口
    可以有其他方法（默认，静态，私有）

    @FunctionalInterface：判断是否是函数式接口
 */
@FunctionalInterface
public interface Demo01FunctionalInterface {
    public abstract void method();
}
