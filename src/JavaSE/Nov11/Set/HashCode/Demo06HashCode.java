package JavaSE.Nov11.Set.HashCode;



/*
哈希值是一个十进制的整数，由系统随机给出（就是一个对象的地址值，是一个逻辑值，是模拟出来得到地址，不是数据实际存储的物理地址）
Object类有获取对象哈希值的方法
 */
public class Demo06HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);

        /*
        toString 源码：
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        哈希值的16进制值
         */
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);//实际地址不同 false

        /*
        String类也重写类hashCode方法
         */
        String s1 = new String("abc");//96354
        String s2 = new String("abc");//96354
        String s3 = new String("abc2");//2987024
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }


}
/*
Set 集合调用add时候，调用hashCode() equals()方法
由hashCode()算出哈希地址值
equals()比较内容是否相同
1.若算出哈希地址此前没有，直接存储
2.若算出哈希地址此前有，比较内容
        a.若内容一样，不储存
        b.若内容不一样，储存在同一哈希地址值下（以链表或红黑树的形式）

所以【想不重复】，必须重写hashCode equals方法 Nov22/ReferenceType
 */