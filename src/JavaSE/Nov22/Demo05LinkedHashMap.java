package JavaSE.Nov22;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util,LinkedHashMap<K,V> extends HashMap<K,V>

    底层原理：
        哈希表+链表
 */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map);//{a=d, b=b, c=c} 存取顺序不一致

        LinkedHashMap<String, String> lmap = new LinkedHashMap<>();
        lmap.put("a", "a");
        lmap.put("c", "c");
        lmap.put("b", "b");
        lmap.put("a", "d");
        System.out.println(lmap);//{a=d, c=c, b=b} 存取顺序一致
    }
}
