package JavaSE.Nov11.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
java.util.LinkedHashSet extends HashSet
特点：
    底层是一个哈希表（数组+链表/红黑树）+ 链表： 多了一个链表（记录元素存储顺序），保证元素有序
 */
public class Demo08LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("it");
        System.out.println(set);//[abc, www, it] 无序， 不重复

        LinkedHashSet<String> lSet= new LinkedHashSet<>();
        lSet.add("www");
        lSet.add("abc");
        lSet.add("abc");
        lSet.add("it");
        System.out.println(lSet);//[www, abc, it] 有序， 不重复

    }
}
