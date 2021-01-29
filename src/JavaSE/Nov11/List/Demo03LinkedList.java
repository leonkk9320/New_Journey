package JavaSE.Nov11.List;

import java.util.LinkedList;

/*
LinkedList 结构：
    1.底层链表：查询慢（一个指针一个指针指过去）增删快（改变指针即可）
    2.包含大量首尾元素方法
    注意：使用LinkedList 特有方法，不能使用多态

方法：
    addFirst()
    addLast()
    getFirst()
    getLast()
    removeFirst()
    removeLast()
    pop()
    push()
    isEmpty()

 */
public class Demo03LinkedList {
    /*
    查询多的时候，不用
    增删多的时候，用
    【是多线程的】
     */
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        System.out.println(ll);

        //插入开头 addFirst 与 push 等效
        ll.addFirst("www");
        ll.push("hhh");
        System.out.println(ll);

        //插入末尾 与 add()相同
        ll.addLast("com");
        System.out.println(ll);

        //读取
        System.out.println(ll.getFirst() + ll.getLast());

        //删除
        //String last1 = ll.pop(); 与removeFirst() 相同
        String first = ll.removeFirst();
        String last = ll.removeLast();
        System.out.println("移除的第一个元素： " + first);
        System.out.println("移除的最后一个元素： " + last);
        System.out.println(ll);

    }
}
