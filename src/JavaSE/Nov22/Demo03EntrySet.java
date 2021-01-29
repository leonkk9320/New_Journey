package JavaSE.Nov22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
Map 集合遍历的第二种方式： 使用Entry对象遍历

Map 集合中的方法：
    Set<Map.Entry<K,V>> entrySet()
步骤：
    1.使用entrySet()方法把entry对象（键值对）取出来，存到一个set里
    2.遍历Set,取出每一个entry对象
    3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhao", 168);
        map.put("yang", 165);
        map.put("lin", 178);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Iterator<Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String k = entry.getKey();//it.next().getKey();
            Integer v = entry.getValue();//it.next().getValue();
            System.out.println(k + "=" + v);
        }

        System.out.println("=======");

        for(Map.Entry<String, Integer> entry : set){
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + "=" + v);
        }
    }
}
