package JavaSE.Nov22.ReferenceType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap 存储自定义类型键值
    Map集合保证key唯一性：
        自定义类型作为key的元素，必须重写hashCode方法和equals方法，以保证key 唯一  Nov11/Set/HashCode
 */
public class Demo04ReferenceType {
    public static void main(String[] args) {
        show01();
        System.out.println("=======");
        show02();
    }

    /*
    key: String类型， 自己重写了hashCode方法和equals方法，可以保证key唯一
    value: Person
        value 可以重复（同名同年龄的视为同一个人）
     */
    private static void show01(){
        HashMap<String, Person> map = new HashMap<>();
        map.put("beijing", new Person("He", 18));
        map.put("shanghai", new Person("Zhang", 19));
        map.put("guangzhou", new Person("Li", 20));
        map.put("beijing", new Person("Zhao", 18));//key重复， 新的value值代替旧的value值

        //keySet + 增强for遍历
        Set<String> set = map.keySet();
        for(String key : set){
            Person value = map.get(key);
            System.out.println(key+"=>"+value);
        }

    }



    /*
    Person 作为key, 必须重写hashCode 和 equals 方法， 保证Key唯一
     */
    private static void show02(){
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("Queen", 18), "England");
        map.put(new Person("Qinshihuang", 18), "QinGuo");
        map.put(new Person("PuJing", 30), "Russia");
        map.put(new Person("Queen", 18), "MLQS");

        //entrySet + 增强for
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for(Map.Entry<Person, String> entry : set){
            Person p = entry.getKey();
            String n = entry.getValue();
            System.out.println(p + "=>" + n);
        }
    }
}
