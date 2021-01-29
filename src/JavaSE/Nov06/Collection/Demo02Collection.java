package JavaSE.Nov06.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection类方法：（以为着其子类也有这些方法）
 boolean add(E e); 添加元素
 boolean remove(E e); 删除元素
 void clear(); 清空集合
 boolean contains(E,e); 判断是否包含
 boolean isEmpty(); 判断是否为空
 int size(); 集合长度
 Object[] toArray(); 集合转数组

 注意：没有 get() 方法，所以取出要用iterator（general way）
 */
public class Demo02Collection {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("hello");
        c.add("world");
        System.out.println(c);

        boolean r = c.remove("hello");
        System.out.println(c);

        c.clear();
        System.out.println(c);

        c.add("hello");
        c.add("world");
        boolean r2 = c.contains("world");
        boolean r3 = c.isEmpty();
        int i = c.size();
        System.out.println(r2+" " +r3+" "+i);

        Object[] arr = c.toArray();

        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);
        }
    }


}
