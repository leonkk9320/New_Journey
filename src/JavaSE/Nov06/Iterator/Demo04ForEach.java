package JavaSE.Nov06.Iterator;

import java.util.ArrayList;

/*
增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写，只能用于集合或者数组

注意：增强for循环只适用于打印内容，若要对每个元素进行操作，则还需要用iterator，那还是用.hasNext() .next()遍历方便,详见demo05

是JDK1.5后的新特性

for(集合/数组数据类型 变量名 ： 集合名/数组名){
    sout(变量名)；
}

 */
public class Demo04ForEach {
    public static void main(String[] args) {
        demo01();
        System.out.println("=======");
        demo02();
    }

    //增强for循环遍历集合
    private static void demo02(){
        ArrayList<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        for(String s : l){
            System.out.println(s);
        }
    }

    //增强for循环遍历数组
    private static void demo01(){
        int[] arr = {1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
    }
}
