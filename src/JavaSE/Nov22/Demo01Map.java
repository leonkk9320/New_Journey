package JavaSE.Nov22;

import java.util.HashMap;
import java.util.Map;

/*
java.util.Map<k,v>集合
特点：
    1.键值对儿
    2.k,v数据类型可以不一样
*** 3.k 不可以重复， v可以重复 ***
    4.k,v一一对应

    HashSet new 的是一个HashMap的 k值，所以不能重复

java.util.HashMap<k,v>集合，implements Map<k,v>接口
特点：
    1.底层是哈希表：查询速度特别快
        JDK1.8之前：数组➕单向链表
        JDK1.8之后：数组➕单向链表/红黑树（链表长度超过8）：提高查询速度
    2.HashMap无序集合，存储与取出顺序可能不一样

java.util.LinkedHashMap<k,v> extends HashMap<k,v>集合
特点：
    1. 底层是一个哈希表（数组+链表/红黑树）+ 链表： 多了一个链表（记录元素存储顺序），保证元素有序
    2. 有序集合，存储元素和取出元素的顺序是一样的
 */
public class Demo01Map {
    public static void main(String[] args) {
        show01();//put
        System.out.println("==========");
        show02();//remove
        System.out.println("==========");
        show03();//get
        System.out.println("==========");
        show04();//containsKey

    }

    /*
    put 方法
    public V put(K key, V value): 指定元素添加
    返回v： 存储时候key不重复，返回值v是null
           存储时候key重复，新value代替老value，返回被替代的value
     */
    private static void show01(){
        //多态定义
        Map<String, String> map = new HashMap<>();
        String s1 = map.put("lichen", "fanbinbin");//null
        String s2 = map.put("lichen", "fanbinbin2");//fanbinbin
        System.out.println(s1 + " " + s2);
        System.out.println(map);//override tostring
    }

    /*
    remove 方法
    返回被删除的值（k 存在），否则返回null
     */
    private static void show02(){
        Map<String, Integer> map = new HashMap<>();
        map.put("zhao", 168);
        map.put("yang", 165);
        map.put("lin", 178);
        System.out.println(map);

        Integer v1 = map.remove("lin");//可以使用int 接收， autoboxing
        System.out.println(v1);//178
        System.out.println(map);

        Integer v2 = map.remove("abc");//不可以使用int 接收， return null, nullPointerException
        System.out.println(v2);
        System.out.println(map);
    }

    /*
    get 方法
    key 存在，返回value值
    key 不存在，返回null
     */
    private static void show03(){
        Map<String, Integer> map = new HashMap<>();
        map.put("zhao", 168);
        map.put("yang", 165);
        map.put("lin", 178);

        Integer v1 = map.get("yang");
        Integer v2 = map.get("zhang");
        System.out.println(v1 + " "+ v2);
    }

    /*
    containsKey 方法
     */
    private static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhao", 168);
        map.put("yang", 165);
        map.put("lin", 178);

        boolean b1 = map.containsKey("lin");
        boolean b2 = map.containsKey("zhang");
        System.out.println(b1 + " "+ b2);
    }

}
