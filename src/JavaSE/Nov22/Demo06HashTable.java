package JavaSE.Nov22;

import java.util.HashMap;
import java.util.Hashtable;

/*
java.util.HashTable<K,V>集合 implements Map<K,V>

HashTable:底层也是一个哈希表，是一个线程安全的集合，单线程集合，速度慢
HashMap:底层是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快

HashTable:不能存储null键 null值
HashMap:可以存储null键null值（之前所有的集合都可以）

HashTable:其子类Properties依然活跃，Properties集合是一个唯一和IO流结合的舞台
HashTable 和 Vector 被 HashMap 和 ArrayList 取代了
 */
public class Demo06HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);

        Hashtable<String, String> table = new Hashtable<>();
        table.put(null, "a");//报错！
        table.put("b", null);//报错！
        table.put(null, null);//报错！
    }
}
