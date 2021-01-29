package JavaSE.Nov06.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Iterator 常用两个方法：
boolean hasNext() 如果仍有元素可以迭代，返回true
    有没有下一个元素
E next() 返回迭代的下一个元素
    1.取出下一个元素 2.指针移动到下一位

Iterator 是一个接口，需要使用iterator实现类对象
Collection 接口中又一个方法叫 iterator()， 返回的就是迭代器实现类对象
    Iterator<E> iterator()

使用步骤：
1.使用集合中的iterator()获取迭代器实现类对象
2.用hasNext() 判断
3.用next()取出下一个元素

注意：增强for循环只适用于打印内容，若要对每个元素进行操作，则还需要用iterator，那还是用.hasNext() .next()遍历方便，详见demo05
 */
public class Demo03Iterator {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("迪丽热巴");
        c.add("古力娜扎");
        c.add("玛尔扎哈");
        c.add("撒油那啦");

        //1.
        Iterator<String> it = c.iterator();
//        //2.
//        boolean b = it.hasNext();
//        //3.
//        it.next();

        //2.3.直接循环
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
