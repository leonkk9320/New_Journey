package JavaSE.Dec18.Annotation;
/*
JDK 预定义注解：
@Override: 重写
@Deprecated: 表示已过时，再使用该方法，方法上有横线，但仍然可以用
@SuppressWarnings: 压制警告
    一般传参all @SuppressWarnings("all")

自定义注解：
格式：
    元注解
    public @interface 注解名称{}

元注解：
    @Target:能够作用的位置
        ElementType(enum): TYPE类 METHOD方法 FIELD成员变量
    @Retention：注解保留阶段
        RetentionPolicy(enum): RUNTIME > CLASS > SOURCE
        Runtime直接包含了后两者
    @Documented：是否形成文档抽取到API文档
    @Inherited：注解是否被子类继承 A extends B B有类注解，A也有
 */
//注解本质就是一个接口，该接口默认继承了Annotation接口

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Demo03Annotation {
    int value();//第一个属性固定叫value()，这样可以省略不写即 value = 1 可以直接写成 1
    String name() default ""; //加default那么就可以不懈，有默认值
    int age() default -1; //读取到最后返回-1， index找不到返回-1
}
