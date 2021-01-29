package JavaSE.Nov11.Set.ReferenceTypeInHashSet;

import java.util.HashSet;

/*
HashSet 储存自定义
Set集合保存元素唯一
    存储的元素必须重写（String Person, ...), 必须重写hashCode和 equals方法

要求：同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo07ReferenceTypeInHashSet {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女", 18);
        Person p2 = new Person("小美女", 18);
        Person p3 = new Person("小美女", 20);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        //重写前，三个
        //[Person{name='小美女', age=18}, Person{name='小美女', age=20}, Person{name='小美女', age=18}]
        System.out.println(set);//理应两个人，因为同名同年龄了
        //为什么是三个？因为p1 p2的哈希值不一样，会分别储存

        //重写后，两个，哈希地址一样，内容一样
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);//地址不一样，是堆内存地址，不是哈希地址，证明不是同一个object
        System.out.println(p1.equals(p2));//内容一样

    }
}
