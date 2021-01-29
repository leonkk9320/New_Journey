package JavaSE.Nov23;
/*
throw 关键字
作用：
    可以使用throw关键字在指定的方法中抛出指定的异常
使用：
    throw new xxxException("异常产生原因");
注意：
    1.throw必须写在方法的内部
    2.throw后面new的对象必须是Exception或者Exception子类对象
    3.throw抛出指定的异常对象，我们就必须处理这个异常对象
        如果创建的是RunTimeException 或者是 RunTimeException 的子类对象，我们可以不处理，【默认】交给JVM处理（红字打印异常对象，中断程序）
        如果创建的是编译异常，我们就必须处理这个异常，要么throws【手动交给JVM】， 要么try...catch
 */
public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int e = getElement(arr, 3);
        System.out.println(e);
    }
    /*
    定义一个方法，获取数组指定索引出元素
    参数：
        int[] arr
        int index
    以后工作中，我们首先必须对方法传递过来的参数，进行合法性校验
    如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法调用者，传递参数有问题
     */
    public static int getElement(int[] arr, int index){
        /*
        对arr参数进行校验
        如果arr 是null
        抛出空指针异常，告知方法调用者"传递数组对值是null"
         */
        if(arr == null){
            throw new NullPointerException("传递数组对值是null"); //产生对象，抛给main
        }

        /*
        对index进行合法检验
        如果index越界
        告知："传递对索引超出了数组对使用范围"
         */
        if(index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递对索引超出了数组对使用范围");//产生对象，抛给main
        }
        int ele = arr[index];
        return ele;
    }
}


/*
【异常】本质：
1.方法内有异常，JVM根据错误产生错误对象（比如NullPointerException对一个对象），扔给调用者（一般为main方法）
2.main方法不会处理，抛给JVM
3.JVM红字打印问题，并且中断程序
 */