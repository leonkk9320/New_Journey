package JavaSE.Nov02.Demo02MethodLocalInnerClass;
/*
局部内部类，如果希望访问所在的方法的局部变量，那么这个局部变量必须是【有效final的】

从Java8开始，只要局部变量事实不变，那么final关键字可以省略

原因：
1. new出来的东西在堆当中
2. 局部变量是跟着方法走的，在栈内存当中
3. 方法执行后，立刻出栈，局部变量就会立刻消失
4. 但是new出来的对象会在堆当中持续存在，直到垃圾回收
 */
public class Note {
    public void methodOuter(){
        int num = 10;
        //num = 20; not allowed

        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
