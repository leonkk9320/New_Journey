package JavaSE.Nov22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map 集合的第一种遍历方式：通过键找值的方式

Map集合中的方法：
    Set<K> keySet()
实现步骤：
    1.使用Map集合中的方法keySet(), 把Map集合所有的key取出来，存到一个set中
    2.遍历Set集合，获取Set中每一个key
    3.通过Map集合中的方法get(key), 找value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhao", 168);
        map.put("yang", 165);
        map.put("lin", 178);

        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator(); // Collection 集合里的方法
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value );
        }

        System.out.println("=========");
        //enhanced for loop
        for(String key : set){
            System.out.println(key + "=" + map.get(key));
        }


    }
}
