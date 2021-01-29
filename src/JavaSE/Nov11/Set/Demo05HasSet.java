package JavaSE.Nov11.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
java.util.Set extends Collection接口
Set接口特点：
    1.不允许重复元素
    2.没有索引，没有带索引带方法，也不能使用for循环

java.util.HashSet集合 implements Set
new 的是一个HashMap的 k值，所以不能重复
HashSet特点：
    1.不允许重复元素
    2.没有索引，无带索引方法，也不能使用普通for循环
    3.无序集合，存储和取出带顺序可能不一致
    4.底层是一个哈希表结构（查询速度非常快）

jdk1.8 之前： 哈希表 = 数组 + 链表
jdk1.8 之后： 哈希表 = 数组 + 链表 （冲突元素<8）
             哈希表 = 数组 + 红黑树（冲突元素>=8）
    注意：其中的数组，初始长度为16，与StringBuilder 一致
*/
public class Demo05HasSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        //使用迭代器遍历
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer n = it.next();
            System.out.print(n + " "); // 1 2 3重复带元素没有存进去
        }
        System.out.println("");
        //增强for（enhanced for loop）
        for(int i : set){
            System.out.print(i + " ");
        }

    }

}
