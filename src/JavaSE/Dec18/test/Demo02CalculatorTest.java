package JavaSE.Dec18.test;
/*
Junit:
1. 定义测试类：
    测试类名：被测试类名Test （CalculatorTest）
    包名： xxx.xxx.xx.test  （cn.itcast.test）
2. 定义测试方法：可以独立运行
    方法名: test测试方法名 （testAdd()）
    返回值：void
    参数列表：空参
3. 给方法加@Test
4. 导入junit的依赖环境 （小灯泡）

判定结果：
绿色：成功
红色：失败
一般使用断言操作

@Before: 在测试前先执行Before，用于资源申请
@After: 在测试后必执行After，用于资源释放，【就算测试有问题，也会执行此代码】
 */

import JavaSE.Dec18.junit.Demo01Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Demo02CalculatorTest {
    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close...");
    }

    @Test
    public void testAdd(){
        Demo01Calculator c = new Demo01Calculator();
        int result = c.add(1,2);
        System.out.println("testAdd...");
        //System.out.println(result); 一般不输出，输出不一定就代表对
        Assert.assertEquals(3,result);
    }
}
