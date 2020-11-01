package JavaSE.API.ArrayList;
import java.util.ArrayList;
/*
对于array list来说， 有一个<E> 代表范型
范型指集合当中所有的元素，都是统一的什么类型
注意：范型只能是引用类型，不能是基本类型

注意事项：
对于array list来说，直接打印出来的不是地址(不是首元素地址)
而是内容(用括号括起来的整个集合内容)
如果内容是空，得到的是[]
 */
public class Arraylist {
    public static void main(String[] args) {
        //JDK 1.7 后， new 后面<>里可以不写类型
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        //add element
        list.add("leonkk");
        list.add("leon");
        System.out.println(list);

        //get
        String str = list.get(1);
        System.out.println("第二个元素： " + str);

        //remove
        list.remove(0);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println("size is: " + size);
    }
}
