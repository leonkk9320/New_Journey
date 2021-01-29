package JavaSE.Nov11.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
java.util.List 继承Collection
List接口特点：
    1.有序集合：存储元素和取出元素的顺序是一致的（存储123，取出123）
    2.有索引，包含了一些带索引的方法
    3.允许存储重复元素

特有方法：
    add()
    get()
    remove()
    set()

注意：
    索引不能越界
 */
public class Demo01List {
    public static void main(String[] args) {
        //多态
        List<String> list = new ArrayList<>();

        //add
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");

        //不是地址，重写toString
        System.out.println(list);

        //添加指定位置
        list.add(3, "OK");//[a, b, c, OK, d, a]
        System.out.println(list);

        //remove
        String remove = list.remove(2);
        System.out.println("被移除了： " + remove);

        //set
        String set = list.set(4, "A");//返回被替换的元素
        System.out.println(list);
        System.out.println(set);

        System.out.println("===========");

        //遍历1 for
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(s + " ");
        }
        System.out.println("");
        //遍历2 迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        //遍历3 增强for
        for(String s : list){
            System.out.print(s + " ");
        }

    }
}
