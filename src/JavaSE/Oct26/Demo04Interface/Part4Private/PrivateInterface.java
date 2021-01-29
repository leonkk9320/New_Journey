package JavaSE.Oct26.Demo04Interface.Part4Private;
/*
抽取共有方法体，解决两个方法的重复问题
但是应该私有化 实现类的对象不可调用私有化方法

普通私有化
静态私有化
*/
public interface PrivateInterface {
    public default void m1(){
        System.out.println("111");
        mCommon();
    }

    public default void m2(){
        System.out.println("222");
        mCommon();
    }

    public default void mCommon(){
        System.out.println("common part");
    }

//    private void mCommon(){
//        System.out.println("common part");
//    }

//    private static void mCommon(){
//        System.out.println("common part");
//    } 面对的是静态方法

}
