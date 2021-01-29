package JavaSE.Other;
/*
3 元运算符：需要三个数据
格式：
数据类型 变量名称 = 条件判断 ？ 表达式A ： 表达式B；
流程：
条件是否成立：
    true， A 赋值给 变量
    false， B 赋值给 变量
 */
public class Operator {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        //判断A大于B是否成立， 成立赋值a, 不成立赋值b
        int max = a > b ? a : b;
        System.out.println("最大值： " + max); // 20
        System.out.println(a > b ? a : b);
        //a > b ? a : b 错误。 可以赋值 可以打印， 不能什么也不干
         //int result = 3 > 4 ? 2.5 : 10; 错误， 2.5 不能给int

    }
}
