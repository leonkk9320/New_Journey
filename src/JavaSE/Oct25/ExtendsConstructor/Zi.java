package JavaSE.Oct25.ExtendsConstructor;

import JavaSE.Oct25.ExtendsConstructor.Fu;

public class Zi extends Fu {
    public Zi(){
        /*
        父类：
        1 如果不写构造方法，会赠送构造方法，则super() 不会报错
        2 写了唯一有参构造方法，则super()报错，因为赠送的是无参构造方法
          此时需要补充写一个无参构造方法 或 使用 super(param) 这样赠送的 super()不执行，只执行 super(param)
         */
        // super(); //调用父类无参构造方法 赠送的
        super(20);
        System.out.println("子类构造方法");
        //super(20); 不能写这里，必须是第一个statement，父亲的都执行以后，才能有儿子的
    }

    public void method(){
        //super(); 错误！ 只有子类构造方法，才能调用父类构造方法
    }

}
