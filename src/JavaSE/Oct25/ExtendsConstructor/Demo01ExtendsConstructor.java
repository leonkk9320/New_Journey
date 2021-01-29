package JavaSE.Oct25.ExtendsConstructor;

/*
继承关系中，父子类构造方法的访问特点：
1. 子类构造方法中又一个默认隐含的"super()"调用
2. 可以通过super关键字来子类构造调用父类重载构造
3. super的父类构造调用，必须是子类【构造方法】的【第一个语句】。不能一个子类构造调用多次super构造。

总结：
子类必须调用父类构造方法，不写则赠送super(); 写了则用写的指定的super调用，super只能有一个，还必须是第一个。
 */
public class Demo01ExtendsConstructor {
    public static void main(String[] args) {
        Zi zi = new Zi(); // 先父后子
    }
}
